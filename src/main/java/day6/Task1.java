package day6;

public class Task1 {
  public static void main(String[] args) {
    Car car = new Car();
    Motorbike motorbike = new Motorbike(2018, "Red", "Yamaha");
    car.info();
    System.out.println(car.yearDifference(2017));
    motorbike.info();
    System.out.println(motorbike.yearDifference(2020));
  }
}
