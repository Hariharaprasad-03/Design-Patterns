package FlyweightDesign;

public class AstroidFlyweight {

    private int length;
    private int weight;
    private int breath;
    private String color ;
    private String texture ;

    public AstroidFlyweight(int length , int breath , int weight,String color
                ,String texture){
        this.length = length;
        this.breath = breath;
        this.weight = weight;
        this.color = color;
        this.texture = texture;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getBreath() {
        return breath;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }
}
