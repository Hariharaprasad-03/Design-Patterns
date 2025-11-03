package BridgeDesign;

public class ElectricEngine implements  IEngine{

    @Override
    public String getEngineType() {
        return "Electric";
    }

    @Override
    public void start() {
        System.out.println(getEngineType() + "Engine is Started");
    }
}
