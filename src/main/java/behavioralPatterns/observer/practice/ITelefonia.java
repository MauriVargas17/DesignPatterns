package behavioralPatterns.observer.practice;

public interface ITelefonia {
    void add(TelUser observer);
    void remove(TelUser observer);
    void notifyUser(Notification notification);
}
