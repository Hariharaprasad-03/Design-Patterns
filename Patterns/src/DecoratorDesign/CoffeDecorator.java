package DecoratorDesign;

abstract public class CoffeDecorator  implements Coffe{
    Coffe wrappedCoffe ;

    CoffeDecorator(Coffe coffe){
        wrappedCoffe = coffe ;
    }

    @Override
    public double getCost() {
        return wrappedCoffe.getCost();
    }

    @Override
    public String getDescription() {
        return wrappedCoffe.getDescription();
    }
}
