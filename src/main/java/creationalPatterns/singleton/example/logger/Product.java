package creationalPatterns.singleton.example.logger;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(){
        Logger.getInstance().info("Product - Creating product");
    }

    public int promoPrice(){
        Logger.getInstance().info("Product - promoPrice");
        return price/2;
    }

    public String getName() {
        Logger.getInstance().info("Product - getName");
        return name;
    }

    public void setName(String name) {
        Logger.getInstance().info("Product - setName");
        this.name = name;
    }

    public int getPrice() {
        Logger.getInstance().info("Product - getPrice");
        return price;
    }

    public void setPrice(int price) {
        Logger.getInstance().info("Product - setPrice");
        this.price = price;
    }

    public int getQuantity() {
        Logger.getInstance().info("Product - getQuantity");
        return quantity;
    }

    public void setQuantity(int quantity) {
        Logger.getInstance().info("Product - setQuantity");
        this.quantity = quantity;
    }
}
