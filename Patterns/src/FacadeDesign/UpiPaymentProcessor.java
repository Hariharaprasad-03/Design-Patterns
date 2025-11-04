package FacadeDesign;

import java.util.Scanner;

public class UpiPaymentProcessor implements  IPaymentProcessor{
    Scanner sc = new Scanner(System.in);
    public boolean pay(double amount){

        System.out.println("Enter Upi Id");
        String upiID = sc.nextLine();
        System.out.println( "paid" + "RS:" + amount + " from " + upiID);
        return true ;
    }
}
