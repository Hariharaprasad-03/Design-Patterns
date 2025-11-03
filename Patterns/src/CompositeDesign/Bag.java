package CompositeDesign;

public class Bag extends Product{

    public Bag( String name , double price) {
        super(name,price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    @Override
    public int getNumberOfItems() {
        return this.noOfItems;
    }
    public void boxInfo() {
        System.out.println(this.getName());
    }



}
