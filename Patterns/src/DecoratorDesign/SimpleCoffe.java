package DecoratorDesign;

public class SimpleCoffe implements Coffe {

    private double cost = 10.0;

    public double getCost(){
        return cost;
    }
    public String getDescription(){
        return "coffe" ;
    }
}
