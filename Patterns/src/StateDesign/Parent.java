package StateDesign;

 public class Parent {

     public static  void m1(){
         System.out.println("parent method");
     }
}
class Child extends Parent{

     public static void m1(){
         System.out.println("child methods");
     }

}