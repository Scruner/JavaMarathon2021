package day13;

public class Task1 {
  public static void main(String[] args) {
    User user1 = new User("Lion");
    User user2 = new User("Dan");
    User user3 = new User("Nick");

    MessageDatabase.sendMessage(user1, user2, "Здоровеньки булы!");
    MessageDatabase.sendMessage(user1, user2, "Чё как сам?");
    MessageDatabase.sendMessage(user2, user1, "Даров");
    MessageDatabase.sendMessage(user2, user1, "Да ни чё так");
    MessageDatabase.sendMessage(user2, user1, "По тихой. Как сам?");
    MessageDatabase.sendMessage(user3, user1, "Нихау");
    MessageDatabase.sendMessage(user3, user1, "Чего затихли?");
    MessageDatabase.sendMessage(user3, user1, "Против кого дружите?");
    MessageDatabase.sendMessage(user1, user3, "Хеллоу Уродлд!");
    MessageDatabase.sendMessage(user1, user3, "Чё разорался?");
    MessageDatabase.sendMessage(user1, user3, "Тута люди общаются");
    MessageDatabase.sendMessage(user3, user1, "Да понял я, понял!");
    System.out.println(MessageDatabase.getMessages());

    MessageDatabase.showDialog(user1, user3);
  }
}
