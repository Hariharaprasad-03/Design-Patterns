package FacadeDesign;

public class BillingService {

    IPaymentProcessor paymentProcessor = new UpiPaymentProcessor();

    public boolean pay(double amount){
        return paymentProcessor.pay(amount);
    }
}
