package behavioralPatterns.observer.practice;

public class News implements Notification{

    private String msg;

    public News(String msg) {
        this.msg = msg;
    }


    @Override
    public String getMsg() {
        return msg;
    }
}
