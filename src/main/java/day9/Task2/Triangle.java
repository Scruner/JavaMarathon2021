package day9.Task2;

public class Triangle extends Figure {
  private double sideAlength;
  private double sideBlength;
  private double sideClength;

  public Triangle(double sideAlength, double sideBlength, double sideClength, String color) {
    super(color);
    this.sideAlength = sideAlength;
    this.sideBlength = sideBlength;
    this.sideClength = sideClength;
  }

  @Override
  public double area() {
    double halfPerimeter = perimeter() / 2;
    return Math.sqrt(
            halfPerimeter
            * (halfPerimeter - sideAlength)
            * (halfPerimeter - sideBlength)
            * (halfPerimeter - sideClength));
  }

  @Override
  public double perimeter() {
    return sideAlength + sideBlength + sideClength;
  }
}
