package ObserverDesignPattern.Observable;

public interface StockObservable {
    public void add();
    public void remove();
    public void notifySubscriber();
}
