package ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class GoldRate implements  Observable{

    private  double goldRate ;
    private List<IObserver> observers;

    GoldRate(double rate ){
        this.goldRate = rate;
        observers = new ArrayList<>();
    }

    public double getGoldRate() {
        return goldRate;
    }

    public void setGoldRate(double goldRate) {
        this.goldRate = goldRate;
        sendNotifications();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer) ;

    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void sendNotifications() {

        for ( IObserver observer : observers){
            observer.update(this.goldRate);
        }
    }
}
