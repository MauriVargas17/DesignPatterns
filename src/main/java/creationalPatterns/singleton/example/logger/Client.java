package creationalPatterns.singleton.example.logger;

public class Client {
    private String name;
    private String id;
    private int points;

    public Client(){
        Logger.getInstance().info("Creating client");
    }

    public String getName() {
        Logger.getInstance().info("Client - getName");
        return name;
    }

    public void setName(String name) {
        Logger.getInstance().info("Client - setName");
        this.name = name;
    }

    public String getId() {
        Logger.getInstance().info("Client - getId");
        return id;
    }

    public void setId(String id) {
        Logger.getInstance().info("Client - setId");
        this.id = id;
    }

    public int getPoints() {
        Logger.getInstance().info("Client - getPoints");
        return points;
    }

    public void setPoints(int points) {
        Logger.getInstance().info("Client - setPoints");
        this.points = points;
    }
}
