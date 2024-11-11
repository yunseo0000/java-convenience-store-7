package util;

import domain.Product;
import domain.Promotion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {
    public static List<Product> loadProducts(String filePath) throws IOException {
        List<Product> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int price = Integer.parseInt(parts[1].trim());
                int stock = Integer.parseInt(parts[2].trim());
                products.add(new Product(name, price, stock));
            }
        }
        return products;
    }

    public static List<Promotion> loadPromotions(String filePath) throws IOException {
        List<Promotion> promotions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String productName = parts[0].trim();
                String type = parts[1].trim();
                int requiredAmount = Integer.parseInt(parts[2].trim());
                int bonusAmount = Integer.parseInt(parts[3].trim());
                promotions.add(new Promotion(productName, type, requiredAmount, bonusAmount));
            }
        }
        return promotions;
    }
}
