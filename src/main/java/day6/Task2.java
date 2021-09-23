package day6;

public class Task2 {
  public static void main(String[] args) {
    Airplane airplane = new Airplane("Boing", 1999, 350, 6757);
    airplane.setYear(2007);
    airplane.setLength(470);
    airplane.fillUp(2300);
    airplane.fillUp(4870);
    airplane.info();
  }
}
