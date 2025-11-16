package commadDesign;

public class Remote {
    private ICommand lightCommand ;
    private ICommand acCommand ;

    public void setLightCommand(ICommand lightCommand) {
        this.lightCommand = lightCommand;
    }

    public void setAcCommand(ICommand acCommand) {
        this.acCommand = acCommand;
    }

    public void onLight(){
        lightCommand.execute();
    }
    public void offLight(){
        lightCommand.undo();
    }
    public void onAc(){
        acCommand.execute();
    }
    public void offAc(){
        acCommand.undo();
    }
}
