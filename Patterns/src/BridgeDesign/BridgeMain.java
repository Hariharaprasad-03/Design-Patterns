package BridgeDesign;

public class BridgeMain {

    public static  void main(String[] args){

        Car bmw = new Bmw("e4",new PertrolEngine());
        bmw.drive();
        Car ferrai = new Ferrai("288 Gto",new DiselEngine());
        ferrai.drive();
        Car rolls = new RollsRoyace("rolls",new ElectricEngine());
        rolls.drive();

    }

}
