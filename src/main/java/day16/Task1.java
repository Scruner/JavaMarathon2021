package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) throws FileNotFoundException {
    printResult(new File("TestFile.txt"));
  }

  public static void printResult(File file) throws FileNotFoundException {
    Scanner scanner = new Scanner(file);
    double summa = 0;
    int count = 0;
    while (scanner.hasNextLine()) {
      int number = scanner.nextInt();
      count++;
      summa += number;
    }
    double average = summa / count;
    System.out.printf(average + " --> " + "%.3f", average);
  }
}
