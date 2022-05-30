package behavioralPatterns.iterator.practice;

public class Vehicle implements ICloneable{
    private int cost;
    private String model;
    private int numberOfSeats;
    private String type;

    public Vehicle(int cost, String model, int numberOfSeats, String type) {
        this.cost = cost;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }

    @Override
    public Vehicle clone() {
        Vehicle clone = new Vehicle(getCost(), getModel(), getNumberOfSeats(), getType());
        return clone;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
