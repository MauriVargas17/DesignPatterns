package behavioralPatterns.observer.practice;

public interface IUser {
    void update(Notification notification);
    boolean[] getPreferences();
}
