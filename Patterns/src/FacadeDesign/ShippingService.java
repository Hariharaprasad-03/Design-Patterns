package FacadeDesign;

public class ShippingService {

    public void shipProduct( String customerId , String productId){
        System.out.println("shipping " + productId +"to customer " + customerId);
    }
}
