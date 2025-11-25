package modelViewController;

public class VolumeController implements  IVolumeController{

    private VolumeObserver view ;
    private IVolumeModel volumeModel ;

    public VolumeController( VolumeObserver view){
        this.view = view ;
        this.volumeModel = new VolumeModel();
        volumeModel.addObserver(view);
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Volume Controller passed to Volume Model");
        volumeModel.setVolume(volumeModel.getVolume()-5);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Volume Controller passed to Volume Model");
        volumeModel.setVolume(volume);
    }

    @Override
    public void increaseVolume() {
        System.out.println("Volume Controller passed to Volume Model");
        volumeModel.setVolume(volumeModel.getVolume()+5);
    }

}
