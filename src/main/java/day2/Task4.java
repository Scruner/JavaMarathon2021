package day2;

import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();
    double y = 0;
    double y1 = (x * x - 10) / (x + 7);
    double y2 = (x + 3) * ((x * x) - 2);
    if (x >= 5) {
      y = y1;
    } else if (x > -3 && x < 5) {
      y = y2;
    } else {
      y = 420;
    }
    System.out.println(y);
  }
}
