package commadDesign;

public class CommandMain {

    public static void main( String[] args) {
        AC ac = new AC();
        Light light = new Light();

        LightCommand lightCommand = new LightCommand(light);
        AcCommand acCommand = new AcCommand(ac);

        Remote remote = new Remote();
        remote.setAcCommand(acCommand);
        remote.setLightCommand(lightCommand);

        remote.onAc();
        remote.offAc();

        remote.onLight();
        remote.offLight();


    }
}
