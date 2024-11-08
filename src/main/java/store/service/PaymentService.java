package service;

import domain.Inventory;
import domain.Product;
import domain.Promotion;

import java.util.List;
import java.util.Map;

public class PaymentService {
    private Inventory inventory;

    public PaymentService(Inventory inventory) {
        this.inventory = inventory;
    }

    public int calculateTotalAmount(Map<String, Integer> purchasedItems, List<Promotion> promotions, boolean applyMembershipDiscount) {
        int totalAmount = 0;

        // 각 구매한 상품에 대해 가격 계산
        for (String itemName : purchasedItems.keySet()) {
            Product product = inventory.getProduct(itemName);
            int quantity = purchasedItems.get(itemName);
            totalAmount += product.getPrice() * quantity;
        }

        // 멤버십 할인 계산 (예시: 총 금액의 10%)
        if (applyMembershipDiscount) {
            totalAmount *= 0.9;
        }

        return totalAmount;
    }
}
