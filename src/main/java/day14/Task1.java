package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) throws IOException {
    File file = new File("TestFile.txt");
    printSumDigits(file);
  }

  public static void printSumDigits(File file) throws IOException {
    Scanner scanner = new Scanner(file);
    if (!file.exists()) {
      throw new IOException("Файл не найден");
    }
    int count = 0;
    int summa = 0;
    while (scanner.hasNextLine()) {
      int nextInt = scanner.nextInt();
      summa += nextInt;
      count++;
    }
    if (count != 10) {
      throw new IOException("Некорректный входной файл");
    }
    System.out.println(summa);
    scanner.close();
  }
  //    try {
  //      Scanner scanner = new Scanner(file);
  //      String line = scanner.nextLine();
  //      String[] numbers = line.split(" ");
  //      if (numbers.length !=10) {
  //        throw new IllegalArgumentException();
  //      }
  //      int summa = 0;
  //      for (String number: numbers) {
  //        summa+=Integer.parseInt(number);
  //        }
  //        System.out.println(summa);
  //      } catch (FileNotFoundException e) {
  //        System.out.println("Файл не найден");
  //      } catch (IllegalArgumentException e) {
  //      System.out.println("Некорректный входной файл");
  //    }
  //  }
}
