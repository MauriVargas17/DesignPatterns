package behavioralPatterns.observer.practice;

public class Promo implements Notification{

    private String msg;

    public Promo(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
