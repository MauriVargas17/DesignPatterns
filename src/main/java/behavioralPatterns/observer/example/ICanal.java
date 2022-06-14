package behavioralPatterns.observer.example;

public interface ICanal {
    void subscription(IUser observer);
    void detach(IUser observer);
    void notifyObservers(Video video);
}
