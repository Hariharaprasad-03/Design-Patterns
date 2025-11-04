package AdapterDesign;
import java.util.ArrayList;
import java.util.List ;
public class AdapterMain {


    public static void simulate ( Quackable duck){
        duck.quack();
    }
    public static void main(String[] args){
        Quackable mallardDuck = new MallardDuck();
        Goose goose = new Goose();
        Quackable gooseAdpater = new GooseAdapter(goose);
        Turkey turkey = new Turkey();
        Quackable turkeyAdapter = new TurkeyAdapter(turkey);

        List<Quackable> list = new ArrayList<>();
        list.add(mallardDuck);
        list.add(gooseAdpater);
        list.add(turkeyAdapter);


        for( Quackable duck : list){
            simulate(duck);
        }
    }
}
