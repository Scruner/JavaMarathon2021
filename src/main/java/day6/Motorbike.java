package day6;

public class Motorbike {
  private int yearIssue;
  private String color;
  private String model;

  public Motorbike(int yearIssue, String color, String model) {
    this.yearIssue = yearIssue;
    this.color = color;
    this.model = model;
  }

  public int getYearIssue() {
    return yearIssue;
  }

  public String getColor() {
    return color;
  }

  public String getModel() {
    return model;
  }

  public void info() {
    System.out.println("Это мотоцикл");
  }

  public int yearDifference(int year) {
    return Math.abs(year - yearIssue);
  }
}
