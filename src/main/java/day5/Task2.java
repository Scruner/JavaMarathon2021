package day5;

public class Task2 {
  public static void main(String[] args) {
    Motorbike motorbike = new Motorbike(2021, "Black", "HarleyDavidson");
    System.out.println(" Year of isuue: " +
        motorbike.getYearIssue() + "\n Color: " + motorbike.getColor() + "\n Model: " + motorbike.getModel());
  }
}
