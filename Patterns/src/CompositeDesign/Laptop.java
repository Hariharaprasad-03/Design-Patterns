package CompositeDesign;

public class Laptop extends Product{

    public Laptop(String name , double price){
        super ( name , price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    @Override
    public int getNumberOfItems() {
        return this.noOfItems;
    }

    @Override
    public void boxInfo() {
        System.out.println(this.getName());
    }
}
