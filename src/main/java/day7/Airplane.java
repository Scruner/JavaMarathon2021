package day7;

public class Airplane {
  private String producer;
  private int year;
  private int length;
  private int weight;
  private int fuel = 0;

  public Airplane(String producer, int year, int length, int weight) {
    this.producer = producer;
    this.year = year;
    this.length = length;
    this.weight = weight;
  }

  public void info() {
    System.out.println(
        "Изготовитель: "
            + producer
            + ", год выпуска: "
            + year
            + ", длина: "
            + length
            + ", вес: "
            + weight
            + ", количество топлива в баке: "
            + fuel);
  }

  public void fillUp(int fuelUp) {
    fuel += fuelUp;
  }

  public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
    if (airplane1.length > airplane2.length) {
      System.out.println("Первый самолет длиннее");
    } else if (airplane1.length < airplane2.length) {
      System.out.println("Второй самолет длиннее");
    } else {
      System.out.println("Длины самолетов равны");
    }
  }
}
