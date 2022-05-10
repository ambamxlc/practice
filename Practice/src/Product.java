public class Product {
    private double cost;
    private int quan;
    private String name;

    public Product(double prodCost, int purchaseQuan, String prodName) {
        this.cost = prodCost;
        this.quan = purchaseQuan;
        this.name = prodName;
    }

    public void totalCost() {
        System.out.println("Total cost is $ " + cost * quan);
    }

    public void printProduct() {
        System.out.println(name + " costs $ " + cost + " and " + quan + " units were purchased.");
    }
}