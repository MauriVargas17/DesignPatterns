package prototype.practice;

public class Sim {
    private String telBusinessName;
    private int number;

    public Sim(String telBusinessName, int number) {
        this.telBusinessName = telBusinessName;
        this.number = number;
    }

    public String getTelBusinessName() {
        return telBusinessName;
    }

    public void setTelBusinessName(String telBusinessName) {
        this.telBusinessName = telBusinessName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
