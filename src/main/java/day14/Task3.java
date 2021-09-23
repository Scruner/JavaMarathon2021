package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    System.out.println(parseFileToObjList());
  }

  public static List<Person> parseFileToObjList() {
    List<Person> people = new ArrayList<>();
    File file = new File("people.txt");
    try {
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] humans = line.split(" ");
        Person person = new Person(humans[0], Integer.parseInt(humans[1]));
        if (Integer.parseInt(humans[1]) < 0) {
          throw new IllegalArgumentException();
        }
        people.add(person);
      }
      return people;
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден");
    } catch (IllegalArgumentException e) {
      System.out.println("Некорректный входной файл");
    }
    return null;
  }
}
