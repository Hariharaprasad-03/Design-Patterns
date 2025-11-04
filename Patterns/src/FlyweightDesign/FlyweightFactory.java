package FlyweightDesign;

import java.util.HashMap;

public class FlyweightFactory {

    private HashMap<String ,AstroidFlyweight > flyweight = new HashMap<>();

    public AstroidFlyweight getFlyweight( int length , int breath , int weight ,  String color ,String texture){

        StringBuilder sb = new StringBuilder(50);
        sb.append(length +"|");
        sb.append(breath +"|");
        sb.append(weight + "|");
        sb.append(color +"|");
        sb.append(texture +"|");

        String key = sb.toString();

        if(flyweight.containsKey(key)){
            return flyweight.get(key);
        }
        else {

            AstroidFlyweight fly = new AstroidFlyweight(length,breath,weight,color,texture);
            flyweight.put(key ,fly);
            return fly ;
        }

    }
}
