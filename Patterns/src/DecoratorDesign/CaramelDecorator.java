package DecoratorDesign;

public class CaramelDecorator extends CoffeDecorator {

    public CaramelDecorator(Coffe coffe){
        super(coffe);
    }

    @Override
    public double getCost() {
        return super.getCost()+5.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + caramel";
    }
}
