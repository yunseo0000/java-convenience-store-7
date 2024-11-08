package store.domain;

public class Promotion {
    private final String name;
    private final String targetProduct;
    private final int requiredQuantity;
    private final int freeQuantity;

    public Promotion(String name, String targetProduct, int requiredQuantity, int freeQuantity) {
        this.name = name;
        this.targetProduct = targetProduct;
        this.requiredQuantity = requiredQuantity;
        this.freeQuantity = freeQuantity;
    }

    public String getName() {
        return name;
    }

    public String getTargetProduct() {
        return targetProduct;
    }

    public int getRequiredQuantity() {
        return requiredQuantity;
    }

    public int getFreeQuantity() {
        return freeQuantity;
    }

    public boolean isApplicable(int quantity) {
        return quantity >= requiredQuantity;
    }
}
