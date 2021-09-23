package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) throws IOException {
    System.out.println(parseFileToStringList());
  }

  public static List<String> parseFileToStringList() {
    List<String> list = new ArrayList<>();
    File file = new File("people.txt");
    try {
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String name = scanner.nextLine();
        String[] person = name.split(" ");
        if (Integer.parseInt(person[1]) < 0) {
          throw new IllegalArgumentException();
        }
        list.add(name);
      }
      return list;
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден");
    } catch (IllegalArgumentException e) {
      System.out.println("Некорректный входной файл");
    }
    return null;
  }
}
