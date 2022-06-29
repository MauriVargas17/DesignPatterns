package creationalPatterns.factoryMethod.practice;

public class Passenger {
    private String name;
    private int ci;

    public Passenger(String name, int ci) {
        this.name = name;
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
