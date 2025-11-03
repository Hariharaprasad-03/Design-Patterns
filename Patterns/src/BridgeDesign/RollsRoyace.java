package BridgeDesign;

public class RollsRoyace extends Car{

    private String make ;
    private String model;

    RollsRoyace( String model ,IEngine engine){
        super(engine);
        this.make = "ROLLS ROYACE";
        this.model = model;
    }
    public void drive(){
        start();
        System.out.println(" Rolls Royace Moving ");
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
