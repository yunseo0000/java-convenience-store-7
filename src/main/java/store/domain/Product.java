package domain;

public class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getter 및 Setter 메서드
    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
