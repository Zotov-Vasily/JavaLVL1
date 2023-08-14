package Day13;

public class Task13 {
    public static void main(String[] args) {
        User user1 = new User("Andrey");
        User user2 = new User("Vadim");
        User user3 = new User("Alex");

        user1.sendMessage(user2, "Hello Vadim");
        user1.sendMessage(user2, "When you already learn Java?");

        user2.sendMessage(user1, "Hello Andrey!!!");
        user2.sendMessage(user1, "The task of the thirteenth day is difficult for me.");
        user2.sendMessage(user1, "As soon as I stop swimming in basic things, success will be guaranteed.");

        user3.sendMessage(user1, "Hello Andrey");
        user3.sendMessage(user1, "I also learned Java for a long time");
        user3.sendMessage(user1, "But I got it right");

        user1.sendMessage(user3, "Hello Alex");
        user1.sendMessage(user3, "you are handsome");
        user1.sendMessage(user3, "I didn't doubt you");

        user3.sendMessage(user1, "Thank you!!!");

        MessageDatabase.showDialog(user1, user3);
    }
}
