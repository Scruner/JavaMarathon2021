package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Volvo");
    list.add("BMW");
    list.add("Skoda");
    list.add("Man");
    list.add("Kia");

    System.out.println(list);
    System.out.println("***********************");
    list.add(2, "Toyota");
    list.remove(0);
    System.out.println(list);
  }
}
