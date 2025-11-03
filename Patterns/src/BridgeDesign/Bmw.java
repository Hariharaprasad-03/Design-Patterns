package BridgeDesign;

public class Bmw extends Car{

    private String make;
    private String model ;

    Bmw( String model , IEngine engine){
        super(engine);
        this.make = "BMW";
        this.model = model;
    }
    public void drive(){
        engine.start();
        System.out.println(" BMW  on the Road !");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
