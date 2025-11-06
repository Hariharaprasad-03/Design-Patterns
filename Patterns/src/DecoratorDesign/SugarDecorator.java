package DecoratorDesign;

public class SugarDecorator  extends CoffeDecorator{

    public SugarDecorator(Coffe coffe){
        super(coffe);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost()+2.0;
    }
}
