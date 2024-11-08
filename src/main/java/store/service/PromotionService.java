package service;

import domain.Inventory;
import domain.Product;
import domain.Promotion;

import java.util.List;
import java.util.Map;

public class PromotionService {
    private Inventory inventory;

    public PromotionService(Inventory inventory) {
        this.inventory = inventory;
    }

    public int applyPromotions(Map<String, Integer> purchasedItems, List<Promotion> promotions) {
        int discount = 0;

        for (Promotion promotion : promotions) {
            String productName = promotion.getProductName();
            if (purchasedItems.containsKey(productName)) {
                int quantity = purchasedItems.get(productName);
                if (quantity >= promotion.getRequiredAmount()) {
                    discount += promotion.getBonusAmount();
                }
            }
        }

        return discount;
    }
}
