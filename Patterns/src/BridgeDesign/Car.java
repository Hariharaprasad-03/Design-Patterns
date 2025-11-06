package BridgeDesign;

public  abstract class Car {
     private IEngine engine ;
     Car(IEngine engine){
         this.engine = engine;
     }
     public abstract void drive();
     public void start(){
         engine.start();
     }



     public void getEngineType(){
         engine.getEngineType();
     }


}
