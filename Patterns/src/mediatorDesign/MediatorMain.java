package mediatorDesign;

public class MediatorMain {

    public static  void main( String[] args) {

        ChatMediatorImpl mediator = new ChatMediatorImpl();

        ChatUser sanjay = new ChatUser("sanjay",mediator);
        ChatUser sandeep = new ChatUser("sandeep",mediator);

        sandeep.sendMessage("hi sanjay ");


    }
}
