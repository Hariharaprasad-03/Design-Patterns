package AdapterDesign;

public class GooseAdapter implements Quackable{

    Goose goose ;
    GooseAdapter ( Goose goose){
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
