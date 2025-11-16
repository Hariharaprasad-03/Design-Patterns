package commadDesign;

public class AcCommand implements ICommand{

    private AC ac ;
    public AcCommand(AC ac){
        this.ac = ac ;
    }

    @Override
    public void execute() {
        ac.on();
    }

    @Override
    public void undo() {
        ac.off();
    }
}
