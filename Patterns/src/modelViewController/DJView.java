package modelViewController;

public class DJView implements  BPMObserver{

     private ControllerInterface controller ;
     private BeatModelInterface model ;
     private int bpm = 90;

     DJView(){
         model = new BeatModel(this);
         controller = new BpmController(model);
     }

    @Override
    public void updateBpm(int bpm) {
        System.out.println("Bpm is changed "+this.bpm+"to " + bpm);
        this.bpm = bpm;
    }
    public void increaseBpm(){
        System.out.println("User clicked increse Button");
         controller.increaseBpm();
    }
    public  void decreaseBpm() {
        System.out.println("User clicked decrease button");
        controller.decreaseBpm();
    }
    public void setBpm(int bpm){
         System.out.println("User changed the bpm");
         controller.setBpm(bpm);

    }

}
