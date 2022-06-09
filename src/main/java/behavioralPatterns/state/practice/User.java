package behavioralPatterns.state.practice;

public class User {
    public static void main(String[] webos) throws InterruptedException {
        PC pc = new PC();
        pc.setState(new Off());
        pc.resManager();
        pc.setState(new On());
        pc.resManager();
        pc.setState(new Restart());
        pc.resManager();
    }
}
