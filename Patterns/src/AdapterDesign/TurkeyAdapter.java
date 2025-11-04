package AdapterDesign;

public class TurkeyAdapter  implements Quackable{
    Turkey turkey ;
    TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
