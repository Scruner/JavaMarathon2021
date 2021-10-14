package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("src/main/resources/shoes.csv");
    try {
      Scanner scanner = new Scanner(file);
      File fileOut = new File("src/main/resources/missing_shoes.txt");
      PrintWriter prw = new PrintWriter(fileOut);
      while (scanner.hasNextLine()) {
        String[] shoes = scanner.nextLine().split(";");
        if (Integer.parseInt(shoes[2]) == 0) {
          prw.println(shoes[0] + "," + shoes[1] + "," + shoes[2]);
        }
      }
      prw.close();
      scanner.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
