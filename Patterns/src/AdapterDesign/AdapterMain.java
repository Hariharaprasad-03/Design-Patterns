package AdapterDesign;
import java.util.List ;
public class AdapterMain {

    public static  void similate(List<Quackable> list){
        for ( Quackable duck : list){
            simulate(duck);
        }
    }
    public static void simulate ( Quackable duck){
        duck.quack();
    }
    public static void main(String[] args){
        Quackable mallardDuck = new MallardDuck();
        Goose goose = new Goose();
        Quackable gooseAdpater = new GooseAdapter(goose);
        Turkey turkey = new Turkey();
        Quackable turkeyAdapter = new TurkeyAdapter(turkey);
    }
}
