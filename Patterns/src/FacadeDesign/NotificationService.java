package FacadeDesign;

public class NotificationService {

    public void sendMail ( String message , String customerID){
        System.out.println("sending Mail to " + customerID + ":" + message);
    }
}
