package ObserverDesign;

public class ObserverMain {

    public static void main(String [] args){
        GoldRate gold = new GoldRate(10000.0);
        ObserverImples rateMoniter = new ObserverImples();
        gold.addObserver(rateMoniter);

        System.out.println("====== Gold rate increses 432 Rs=====");
        gold.setGoldRate(gold.getGoldRate() + 432);
        System.out.println("====== in Observer class ======");
        System.out.println(rateMoniter.getGoldRateMoniter()) ;

    }
}
