package behavioralPatterns.command.practice;

public class Character {
    private String name;
    private int level;
    private String power;

    public Character(String name, int level, String power) {
        this.name = name;
        this.level = level;
        this.power = power;
    }

    public void shoot(){
        System.out.println("Shooting");
    }

    public void defend(){
        System.out.println("Defending");
    }

    public void attack(){
        System.out.println("Attacking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
