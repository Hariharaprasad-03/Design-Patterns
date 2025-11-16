package commadDesign;

public class Light {

    private boolean state ;

    public void on() {

        if(state){
            System.out.println("Already On");
            return ;
        }
        this.state = true;
        System.out.println("Light turned on");
    }
    public void off() {

        if( !state)
        {
            System.out.println("Already offed");
            return ;
        }
        this.state = false;
        System.out.println("light are turned off");
    }
}
