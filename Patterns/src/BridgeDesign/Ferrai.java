package BridgeDesign;

public class Ferrai extends Car{

    private String make;
    private String model;


    Ferrai( String model ,IEngine engine){
        super(engine);
        this.make = "Ferrai";
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void drive(){
        engine.start();
        System.out.println(" Ferrari flies");
    }


}
