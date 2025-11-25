package modelViewController;

public class DjView implements VolumeObserver {

    private  IVolumeController controller ;
    private int volume = 0 ;

    public DjView(){
        controller = new VolumeController(this);
    }

    @Override
    public void updateVolume(int volume) {
        this.volume = volume ;
        System.out.println("Volume Updated In Djview to " + volume);
    }
    public void increaseVolume(){
        System.out.println("DJ increase the Volume");
        controller.increaseVolume();

    }
    public void decreaseVolume(){
        System.out.println("DJ decreases the Volume");
        controller.decreaseVolume();
    }
    public void setVolume( int volume){
        System.out.println("DJ sets Volume ->"+ volume);
        controller.setVolume(volume);
    }
}
