package store.view;

import store.domain.Product;

import java.util.Map;

public class OutputView {
    public static void printWelcomeMessage() {
        System.out.println("안녕하세요. W편의점입니다.");
        System.out.println("현재 보유하고 있는 상품입니다.");
    }

    public static void printProducts(Map<String, Product> products) {
        for (Product product : products.values()) {
            String stockInfo = (product.getStock() > 0) ? product.getStock() + "개" : "재고 없음";
            System.out.printf("- %s %d원 %s\n", product.getName(), product.getPrice(), stockInfo);
        }
    }

    public static void printError(String message) {
        System.out.println("[ERROR] " + message);
    }
}
