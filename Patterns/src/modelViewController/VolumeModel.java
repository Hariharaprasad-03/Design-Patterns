package modelViewController;

import java.util.ArrayList;
import java.util.List;

public class VolumeModel implements IVolumeModel {
    private final List<VolumeObserver> observers ;
    private int volume = 0 ;

    public VolumeModel(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(VolumeObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(VolumeObserver o) {
        observers.remove(o);
    }

    @Override
    public int getVolume() {
        return this.volume;

    }

    @Override
    public void setVolume(int volume) {
        this.volume = Math.max(0,volume);
        updateNotification();
    }

    @Override
    public void updateNotification() {

        System.out.println("Updating to All Observers");
        for(VolumeObserver vo : observers){
            vo.updateVolume(this.volume);
        }
    }
}
