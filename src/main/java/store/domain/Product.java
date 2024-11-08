package store.domain;

public class Product {
    private final String name;
    private final int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int amount) {
        if (amount > stock) {
            throw new IllegalArgumentException("재고가 부족합니다.");
        }
        this.stock -= amount;
    }

    public void increaseStock(int amount) {
        this.stock += amount;
    }
}
