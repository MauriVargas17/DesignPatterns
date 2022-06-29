package creationalPatterns.factoryMethod.example;

public class Fruit {
    private String type;
    private String name;
    private int cost;
    private String size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getInfo() {
        return name+" with cost of "+cost+" and size "+size;
    }
}
