package FacadeDesign;

public class InventryService {

    public boolean checkStock( String productId){

        System.out.println("Checking for Product " + productId);
        System.out.println("Items Stock found");
        return true ;
    }
}
