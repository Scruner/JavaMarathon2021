package day19;

import java.awt.*;
import java.util.Scanner;

public class PlayerBoards {
  private final String[][] playerBoard1 = new String[10][10];
  private final String[][] playerBoard2 = new String[10][10];

  public String[][] getPlayerBoard1() {
    return playerBoard1;
  }

  public String[][] getPlayerBoard2() {
    return playerBoard2;
  }
}
