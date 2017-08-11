public class Product {

    private double price;
    private int amount;
    private String name;

    public Product(String name, double price, int amt) {
        this.name = name;
        this.price = price;
        this.amount = amt;
    }

    public void printProduct() {
        System.out.println(this.name+", price "+this.price+", amount "+this.amount);
    }
}
