package ObserverDesign;

public class ObserverImples  implements  IObserver{

    private double goldRateMoniter ;

    @Override
    public void update(double rate) {
        this.goldRateMoniter = rate ;
    }

    public double getGoldRateMoniter() {
        return goldRateMoniter;
    }
}
