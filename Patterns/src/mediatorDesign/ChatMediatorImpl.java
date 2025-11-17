package mediatorDesign;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

    private List<User> users ;
    public ChatMediatorImpl(){
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for( User user : users){
            if( user != sender){
                user.receiveMessage(message);
            }
        }
    }

    public void addUser(User user){
        this.users.add(user);
    }
}
