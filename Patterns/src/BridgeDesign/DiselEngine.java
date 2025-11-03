package BridgeDesign;

public class DiselEngine implements  IEngine{

    @Override
    public String getEngineType() {
        return "Disel";
    }

    @Override
    public void start() {
        System.out.println(getEngineType() + " Engine is Started ");
    }
}
