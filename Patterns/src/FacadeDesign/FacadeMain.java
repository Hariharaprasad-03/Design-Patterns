package FacadeDesign;

public class FacadeMain {

    public static void main(String[] args){
        OrderFacade ord = new OrderFacade();
        ord.placeOrder("Wat123","sandeep123",2);
    }

}
