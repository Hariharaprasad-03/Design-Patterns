package CompositeDesign;

abstract public class Product implements Box{
    protected String name;
    protected  double price ;
    protected int noOfItems;

    Product(String name , double price){
        this.name = name;
        this.price = price ;
        this.noOfItems = 0;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
