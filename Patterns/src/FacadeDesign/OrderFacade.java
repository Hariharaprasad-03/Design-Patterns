package FacadeDesign;

public class OrderFacade {
    private InventryService inventry;
    private BillingService billing ;
    private ShippingService shipping ;
    private NotificationService notification ;

    public OrderFacade()
    {
        inventry = new InventryService();
        billing = new BillingService();
        shipping = new ShippingService();
        notification = new NotificationService();
    }

    public boolean placeOrder(String productId , String customerId , int quantity){

        if ( !inventry.checkStock(productId)){
            System.out.println("outOf Stock");
            return false;
        }
        if (!billing.pay(200.0)){
            System.out.println(" payment Failed");
            return false;
        }
        shipping.shipProduct(customerId,productId);
        notification.sendMail("oredered Successfully" , customerId);
        return true;

    }

}
