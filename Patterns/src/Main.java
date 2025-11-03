import CompositeDesign.Bag;
import CompositeDesign.Box;
import CompositeDesign.CompositeBox;
import CompositeDesign.Laptop;
import CompositeDesign.Book;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("realme" ,30000.0);
        Box bag = new Bag("lenevo Bag" , 500.0);
        Box box1 = new CompositeBox(laptop,bag);

        Book book1 = new Book("Head First Design Patterns" , 500.0);
        Book book2 = new Book("Java The Complete Reference", 2000.0);

        Box box2 = new CompositeBox(book1,book2) ;

        System.out.println("===== Box 1 Info =====");
        System.out.println(box1.calculatePrice());
        System.out.println(box1.getNumberOfItems());

        System.out.println("==== Box2 Info =====");
        System.out.println(box2.calculatePrice());
        System.out.println(box2.getNumberOfItems());

        CompositeBox totalBox = new CompositeBox(box1,box2);

        Laptop macAir4 = new Laptop("MacAir4",2000000.0);
        Box box3 = new CompositeBox(macAir4);

        totalBox.addExtraItems(box3);

        System.out.println("===== Box3 =====");
        System.out.println(box3.calculatePrice());
        System.out.println(box3.getNumberOfItems());




        System.out.println("===== Total Box Info =====");
        System.out.println(totalBox.calculatePrice());
        System.out.println(totalBox.getNumberOfItems());

        totalBox.boxInfo();
    }
}