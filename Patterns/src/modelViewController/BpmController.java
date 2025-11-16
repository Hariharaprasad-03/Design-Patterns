package modelViewController;

public class BpmController implements ControllerInterface{

    BeatModelInterface model ;

    public BpmController(BeatModelInterface model){
        this.model = model ;
    }

    @Override
    public void decreaseBpm() {
        System.out.println("Controller passed to model to decrese");
        model.setBpm(model.getBpm()-1);
    }

    @Override
    public void increaseBpm() {
        System.out.println("Controller passed to model to increase");
        model.setBpm(model.getBpm()+1);
    }

    @Override
    public void setBpm(int bpm) {
        System.out.println("Controller passed model to set bpm");
        model.setBpm(bpm);
    }
}
