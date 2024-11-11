package store;

import domain.Inventory;
import domain.Product;
import domain.Promotion;
import service.PaymentService;
import service.PromotionService;
import util.FileLoader;
import view.InputView;
import view.OutputView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws IOException {
        Inventory inventory = new Inventory();
        List<Product> products = FileLoader.loadProducts("src/main/resources/products.md");
        for (Product product : products) {
            inventory.addProduct(product);
        }

        List<Promotion> promotions = FileLoader.loadPromotions("src/main/resources/promotions.md");

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        PaymentService paymentService = new PaymentService(inventory);
        PromotionService promotionService = new PromotionService(inventory);

        outputView.displayWelcomeMessage();
        outputView.displayInventory(inventory);

        Map<String, Integer> purchasedItems = inputView.getPurchasedItems();
        boolean applyMembershipDiscount = inputView.getMembershipDiscount();

        int totalAmount = paymentService.calculateTotalAmount(purchasedItems, promotions, applyMembershipDiscount);
        int promotionDiscount = promotionService.applyPromotions(purchasedItems, promotions);

        outputView.displayTotalAmount(totalAmount - promotionDiscount);
    }
}
