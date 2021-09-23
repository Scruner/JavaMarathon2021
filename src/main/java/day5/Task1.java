package day5;

public class Task1 {
  public static void main(String[] args) {
    Car car = new Car();
    car.setYearIssue(2020);
    car.setColor("red");
    car.setModel("Toyota");
    System.out.println(car.getYearIssue() + " " + car.getColor() + " " + car.getModel());
  }
}
