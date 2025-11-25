package modelViewController;

public interface ModelInterface {

        void setBpm(int bpm);
        int getBpm();
        void addObserver(VolumeObserver o);
        void removeObserver(VolumeObserver o);
        void updateNotification();

}
