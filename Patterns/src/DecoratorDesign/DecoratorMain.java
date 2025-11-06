package DecoratorDesign;

public class DecoratorMain {

    public static  void main( String[] args){

        Coffe simple = new SimpleCoffe();

        System.out.println("=====Simple  Coffe ====");
        System.out.println(simple.getDescription());
        System.out.println(simple.getCost());

        System.out.println("======= Coffe with Millk ======");
        Coffe milkCoffe = new MilkDecorator(new SimpleCoffe());
        System.out.println(milkCoffe.getDescription());
        System.out.println(milkCoffe.getCost());

        System.out.println("====== coffe with Milk + sugar");
        Coffe coffeWithSugar = new SugarDecorator(new MilkDecorator( new SimpleCoffe()));
        System.out.println(coffeWithSugar.getDescription());
        System.out.println(coffeWithSugar.getCost());

    }
}
