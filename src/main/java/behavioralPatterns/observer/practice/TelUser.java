package behavioralPatterns.observer.practice;

public class TelUser implements IUser{
    private String name;
    private boolean[] preferences;

    public TelUser(String name, boolean[] preferences) {
        this.name = name;
        this.preferences = preferences;
    }

    @Override
    public void update(Notification notification) {
        System.out.println(name+" received: "+notification.getMsg());
    }

    @Override
    public boolean[] getPreferences() {
        return preferences;
    }

    public String getName() {
        return name;
    }
}
