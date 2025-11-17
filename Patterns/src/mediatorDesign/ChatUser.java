package mediatorDesign;

public class ChatUser extends User{

    public ChatUser(String name , ChatMediator mediator){
        super(mediator,name);
        mediator.addUser(this);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + "sends Message");
       mediator.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("IN "+ this.name + " Inbox New Message received ");
        System.out.println(message);

    }
}
