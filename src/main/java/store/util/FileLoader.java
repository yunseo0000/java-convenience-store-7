package store.util;

import store.domain.Inventory;
import store.domain.Product;
import store.domain.Promotion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileLoader {

    public static void loadProducts(String filePath, Inventory inventory) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int price = Integer.parseInt(parts[1].trim());
                int stock = Integer.parseInt(parts[2].trim());
                inventory.addProduct(new Product(name, price, stock));
            }
        }
    }

    public static void loadPromotions(String filePath, List<Promotion> promotions) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                String targetProduct = parts[1].trim();
                int requiredQuantity = Integer.parseInt(parts[2].trim());
                int freeQuantity = Integer.parseInt(parts[3].trim());
                promotions.add(new Promotion(name, targetProduct, requiredQuantity, freeQuantity));
            }
        }
    }
}
