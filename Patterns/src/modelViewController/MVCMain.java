package modelViewController;

public class MVCMain {

    public static void main(String[] args){

        DjView view = new DjView();

        view.setVolume(50);
        view.increaseVolume();
        view.decreaseVolume();

    }
}
