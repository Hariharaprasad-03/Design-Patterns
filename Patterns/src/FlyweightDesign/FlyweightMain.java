package FlyweightDesign;
import java.util.ArrayList;
import java.util.List;

public class FlyweightMain {
    public static void main(String[] args) {
        List<AstroidContext> astroids = new ArrayList<>();

        FlyweightFactory ff = new FlyweightFactory();
        AstroidFlyweight af = ff.getFlyweight(10, 01, 1000, "red", "soft");
        AstroidContext ac = new AstroidContext(1, 2, 200, af);
        System.out.println(ac.getColor());
        astroids.add(ac);
    }


}
