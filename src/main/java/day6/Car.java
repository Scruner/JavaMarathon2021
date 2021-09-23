package day6;

public class Car {
  private int yearIssue;
  private String color;
  private String model;

  public int getYearIssue() {
    return yearIssue;
  }

  public String getColor() {
    return color;
  }

  public String getModel() {
    return model;
  }

  public void setYearIssue(int yearIssue) {
    this.yearIssue = yearIssue;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void info() {
    System.out.println("Это автомобиль");
  }

  public int yearDifference(int year) {
    return Math.abs(year - yearIssue);
  }
}
