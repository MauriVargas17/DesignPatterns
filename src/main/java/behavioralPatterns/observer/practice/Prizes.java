package behavioralPatterns.observer.practice;

public class Prizes implements Notification{

    private String msg;

    public Prizes(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
