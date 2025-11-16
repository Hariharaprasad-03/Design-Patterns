package commadDesign;

public class AC {

    private boolean state = false ;

    public void on () {
        if(state) {
            System.out.println("Already in On");
            return ;
        }
        this.state = true;
        System.out.println(" Ac is turned On");
    }
    public void off() {
        if ( ! state){
            System.out.println("Alreay offed");
            return;
        }
        this.state = ! state ;
        System.out.println("Ac is turned Off");
    }
}
