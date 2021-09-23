package day7;

import java.util.Random;

public class Player {
  public static int countPlayers;
  private int stamina;
  private static final int MAX_STAMINA = 100;
  private static final int MIN_STAMINA = 0;

  public Player(int stamina) {
    this.stamina = stamina;
    if (countPlayers < 6) {
      countPlayers++;
    }
  }

  public int getStamina() {
    return stamina;
  }

  public static int getCountPlayers() {
    return countPlayers;
  }

  public void run() {
    if (stamina == 0) {
      return;
    } else if (stamina > 0) {
      stamina--;
    }
    if (stamina == 0) {
      countPlayers--;
    }
  }

  public static void info() {
    int freePlace = 6 - countPlayers;
    if (countPlayers < 6 && countPlayers >= 0) {
      System.out.println("Команды неполные. На поле еще есть " + freePlace + " свободных мест");
    } else if (countPlayers == 6) {
      System.out.println("На поле нет свободных мест");
    }
    //System.out.println(countPlayers);
  }
}
