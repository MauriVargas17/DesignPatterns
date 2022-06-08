package behavioralPatterns.observer.practice;

public class Prices implements Notification{

    private String msg;

    public Prices(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
