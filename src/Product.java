public class Product {
    private String product;
    private double price;
    private int quantity;

    public Product(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }
    public void printProduct() {
        System.out.println(this.product+  " "+ "Price: " + this.price + " Quantity: " + this.quantity);
    }
}
