package day8;

public class Task1 {
  public static void main(String[] args) {
    StringBuilder string = new StringBuilder();
    long before = System.currentTimeMillis();
    for (int i = 0; i <= 20000; i++) {
      // string = String.format("%d", i);
      string.append(i).append(" ");

    }
    System.out.println(string);
    long after = System.currentTimeMillis();
    System.out.println("Время выполнения программы в миллисекундах равно " + (after - before));

    StringBuilder stringBuilder = new StringBuilder();
    long beforeStb = System.currentTimeMillis();
    for (int i = 0; i <= 20000; i++) {
      // stringBuilder = new StringBuilder(String.format("%d", i));
      stringBuilder.append(i).append(" ");

    }
    System.out.println(stringBuilder);
    long afterStb = System.currentTimeMillis();
    System.out.println(
        "Время выполнения программы в миллисекундах равно " + (afterStb - beforeStb));
  }
}
