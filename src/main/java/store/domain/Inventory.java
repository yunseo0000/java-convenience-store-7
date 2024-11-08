package store.domain;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    public Product getProduct(String name) {
        return products.get(name);
    }

    public void reduceStock(String name, int quantity) {
        Product product = products.get(name);
        if (product == null) {
            throw new IllegalArgumentException("[ERROR] 존재하지 않는 상품입니다.");
        }
        product.reduceStock(quantity);
    }

    public Map<String, Product> getAllProducts() {
        return products;
    }
}
