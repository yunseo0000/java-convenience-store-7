package domain;

public class Promotion {
    private String productName;
    private String type;
    private int requiredAmount;
    private int bonusAmount;

    public Promotion(String productName, String type, int requiredAmount, int bonusAmount) {
        this.productName = productName;
        this.type = type;
        this.requiredAmount = requiredAmount;
        this.bonusAmount = bonusAmount;
    }

    // Getter 메서드
    public String getProductName() { return productName; }
    public String getType() { return type; }
    public int getRequiredAmount() { return requiredAmount; }
    public int getBonusAmount() { return bonusAmount; }
}
