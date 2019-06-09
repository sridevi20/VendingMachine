package Drawer;

public enum ProductCodeType {
    COLA("C1", 0.60),
    DAIRYMILK("A2", 1.00),
    DORITOS("B2", 0.60),
    FANTA("C3", 0.70),
    MALTESERS("A3", 0.50),
    OASIS("C4", 1.00),
    PEPSI("C2", 0.50),
    POMBEAR("B3", 0.70),
    SENSATIONS("B4", 1.00),
    SNICKERS("A1", 0.65),
    TWIX("A4", 0.75),
    WALKERS("B1", 0.50);


    private final String productCode;
    private final double productPrice;

    ProductCodeType(String productCode, double productPrice) {
        this.productCode= productCode;
        this.productPrice = productPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
