package creationalPatterns.factoryMethod.example;

public class Cream {
    private String taste;
    private int cost;
    private String brand;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInfo() {
        return "Cream with cost of "+cost+" taste "+taste+" and brand "+brand;
    }
}
