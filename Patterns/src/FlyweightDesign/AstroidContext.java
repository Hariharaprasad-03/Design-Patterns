package FlyweightDesign;

public class AstroidContext {

    private int posX;
    private int posY;
    private int velocity;
    private AstroidFlyweight astroidFlyweight;

    public AstroidContext( int posx , int posy , int velocity , AstroidFlyweight astroidFlyweight){
        this.astroidFlyweight = astroidFlyweight;
        this.velocity = velocity;
        this.posX = posx;
        this.posY = posy;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getWeight(){
        return astroidFlyweight.getWeight();
    }
    public int getLength(){
        return astroidFlyweight.getLength();
    }
    public int getBreath(){
        return astroidFlyweight.getBreath();

    }
    public String getTexture(){
        return astroidFlyweight.getTexture();
    }
    public String getColor (){
        return astroidFlyweight.getColor() ;
    }
}
