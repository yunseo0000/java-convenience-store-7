package view;

import domain.Inventory;
import domain.Product;

public class OutputView {
    public void displayWelcomeMessage() {
        System.out.println("안녕하세요. W편의점입니다.");
        System.out.println("현재 보유하고 있는 상품입니다.");
    }

    public void displayInventory(Inventory inventory) {
        for (Product product : inventory.getProducts().values()) {
            System.out.println("- " + product.getName() + " " + product.getPrice() + "원 " + product.getStock() + "개");
        }
    }

    public void displayTotalAmount(int amount) {
        System.out.println("총 구매액: " + amount + "원");
    }
}
