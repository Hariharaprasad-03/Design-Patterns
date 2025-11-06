package DecoratorDesign;

public class MilkDecorator extends CoffeDecorator{

    public MilkDecorator(Coffe coffe){
        super(coffe);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Milk";
    }
}
