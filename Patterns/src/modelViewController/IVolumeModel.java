package modelViewController;

public interface IVolumeModel {

        void setVolume(int volume);
        int getVolume();
        void addObserver(VolumeObserver o);
        void removeObserver(VolumeObserver o);
        void updateNotification();

}
