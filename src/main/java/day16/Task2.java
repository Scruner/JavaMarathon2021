package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) throws FileNotFoundException {
    File file1 = new File("file1.txt");
    PrintWriter printWriter1 = new PrintWriter(file1);
    Random random = new Random();
    int[] array = new int[1000];
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(100);
      printWriter1.println(array[i]);
    }
    printWriter1.close();
    Scanner scanner = new Scanner(file1);
    File file2 = new File("file2.txt");
    PrintWriter printWriter2 = new PrintWriter(file2);
    int count = 0;
    double summa = 0;
    while (scanner.hasNextLine()) {
      int number = Integer.parseInt(scanner.nextLine());
      summa += number;
      count++;
      if (count == 20) {
        printWriter2.println(summa / 20.0);
        count = 0;
        summa = 0;
      }
    }
    printWriter2.close();
    printResult(file2);
  }

  public static void printResult(File file) throws FileNotFoundException {
    Scanner scanner = new Scanner(file);
    double result = 0;
    while (scanner.hasNextLine()) {
      result += Double.parseDouble(scanner.nextLine());
    }
    System.out.println((int) result);
  }
}
