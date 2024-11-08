package domain;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    public Product getProduct(String name) {
        return products.get(name);
    }

    public boolean hasProduct(String name) {
        return products.containsKey(name);
    }

    public Map<String, Product> getProducts() {
        return products;
    }
}
