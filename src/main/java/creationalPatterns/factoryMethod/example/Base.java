package creationalPatterns.factoryMethod.example;

public class Base {
    private String name;
    private String size;
    private String type;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getInfo() {
        return name+" with cost of "+cost+" type "+type+" and size "+size;
    }
}
