package day7;

public class Task2 {
  public static void main(String[] args) throws Exception {
    Player player1 = new Player(90);
    Player player2 = new Player(98);
    Player player3 = new Player(100);
    Player.info();
    Player player4 = new Player(93);
    Player player5 = new Player(97);
    Player player6 = new Player(95);
    Player.info();
    Player player7 = new Player(92);
    System.out.println("--------------------------------------");
    while (player4.getStamina() != 0) {
      player4.run();
    }
    Player.info();
  }
}
