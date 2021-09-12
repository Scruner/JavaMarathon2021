package day1;

public class Task5 {
  public static void main(String[] args) {
    var year = 1980;
    for (; year < 2021; year = year + 4) {
      System.out.println("Олимпиада " + year + " года");
    }
  }
}
