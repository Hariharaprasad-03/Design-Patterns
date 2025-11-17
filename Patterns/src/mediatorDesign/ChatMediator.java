package mediatorDesign;

public interface ChatMediator {

    public void sendMessage(String message,User sender);
    public void addUser( User user);
}
