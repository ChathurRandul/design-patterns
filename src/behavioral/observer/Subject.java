package behavioral.observer;

// Subject interface
public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}
