package CompositeDesign;

public class Book  extends Product {

    public Book( String name , double price){
        super(name,price);
    }

    @Override
    public int getNumberOfItems() {
        return this.noOfItems;
    }

    @Override
    public double calculatePrice() {
        return this.getPrice() ;
    }
    public void boxInfo() {
        System.out.println(this.getName());

    }

}
