package day19.task3;

import day19.PlayerBoards;

import java.util.Arrays;
import java.util.Scanner;

/** @author Neil Alishev */
public class Task3 {
  public static void main(String[] args) {
    PlayerBoards player1 = new PlayerBoards();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Начнём расставлять корабли на поле Player 1. Другой игрок, не смотри!");
    System.out.println("Введи координаты четырёхпалубного корабля (формат: x,y;x,y;x,y;x,y)");
    //int sheep = scanner.nextInt();
    for (int i = 0; i < player1.getPlayerBoard1().length; i++) {
      for (int j = 0; j < player1.getPlayerBoard1()[i].length; j++) {
        player1.getPlayerBoard1()[i][j] = scanner.nextLine();
        System.out.print(player1.getPlayerBoard1()[i][j]);
      }
      System.out.println();
    }
  }
}
