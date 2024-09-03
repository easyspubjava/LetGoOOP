package observer;

public abstract class Subject {
    public abstract void registerObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void notify(String message);

}
