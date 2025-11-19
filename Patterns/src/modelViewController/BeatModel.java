package modelViewController;

import java.util.List;

public class BeatModel implements  BeatModelInterface{

    private int bpm = 90 ;
    private List<BPMObserver> observerList ;


    BeatModel(){

    }

    @Override
    public void addObserver(BPMObserver o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        observerList.remove(o);
    }

    @Override
    public void setBpm(int bpm) {
        this.bpm = bpm;
        System.out.println("---> model Updating to view");
        view.updateBpm(this.bpm);

    }
    public void notifyObservers() {
        for ( BPMObserver o : observerList){
            o.updateBpm(this.bpm);
        }
    }
    public  int getBpm(){

        return this.bpm ;
    }

}
