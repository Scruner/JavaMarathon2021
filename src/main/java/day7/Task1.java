package day7;

public class Task1 {
  public static void main(String[] args) {
    Airplane airplane1 = new Airplane("Bowing", 2018, 230, 450);
    Airplane airplane2 = new Airplane("Tu", 2020, 350, 650);
    airplane1.fillUp(3500);
    airplane2.fillUp(4000);
    airplane1.info();
    airplane2.info();
    Airplane.compareAirplanes(airplane1, airplane2);
  }
}
