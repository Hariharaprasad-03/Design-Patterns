package BridgeDesign;

public class PertrolEngine implements  IEngine{

    public void start(){
        System.out.println(getEngineType() + " Engine is Started");
    }

    @Override
    public String getEngineType() {
        return "Petrol";
    }
}
