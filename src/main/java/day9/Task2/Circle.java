package day9.Task2;

public class Circle extends Figure {
  private double cycleRadius;

  public Circle(double cycleRadius, String color) {
    super(color);
    this.cycleRadius = cycleRadius;
  }

  @Override
  public double area() {
    return Math.PI * Math.pow(cycleRadius, 2);
  }

  @Override
  public double perimeter() {
    return 2 * Math.PI * cycleRadius;
  }
}
