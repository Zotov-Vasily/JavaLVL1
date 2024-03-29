package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMassage(User sender, User receiver, String text){
        messages.add(new Message(sender, receiver, text));
    }

    public static void showDialog(User u1, User u2){
        for(Message message : messages){
            if(message.getSender() == u1 && message.getReceiver() == u2 ||
                    message.getReceiver() == u1 && message.getSender() == u2){
                System.out.println(message.getSender() + ":" + message.getText());

            }
        }
    }
}
