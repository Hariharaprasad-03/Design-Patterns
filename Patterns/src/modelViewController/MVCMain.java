package modelViewController;

public class MVCMain {

    public static void main(String[] args){

        DJView dj = new DJView();
        dj.increaseBpm();
        dj.decreaseBpm();
        dj.setBpm(120);
    }
}
