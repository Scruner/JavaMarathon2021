package day8;

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

  public int getFuel() {
    return fuel;
  }

    public String toString() {
      return "Изготовитель: "
          + producer
          + ", год выпуска: "
          + year
          + ", длина: "
          + length
          + ", вес: "
          + weight
          + ", количество топлива в баке: "
          + fuel;
    }

    //Сгенерированный Идеей toString() оставил для сравнения.
//  @Override
//  public String toString() {
//    return "Airplane{"
//        + "producer='"
//        + producer
//        + '\''
//        + ", year="
//        + year
//        + ", length="
//        + length
//        + ", weight="
//        + weight
//        + ", fuel="
//        + fuel
//        + '}';
//  }

  public void fillUp(int fuelUp) {
    fuel += fuelUp;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setLength(int length) {
    this.length = length;
  }
}
