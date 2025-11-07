package ObserverDesign;

public interface Observable {

    public void addObserver(IObserver obervers);
    public void removeObserver(IObserver obervers);
    public void sendNotifications();

}
