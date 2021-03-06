package day11.task1;

public class Picker implements Worker {
  private int salary;
  private Warehouse warehouse;

  public int getSalary() {
    return salary;
  }

  public Picker(Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  @Override
  public void doWork() {
    salary += 80;
    warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
  }

  @Override
  public void bonus() {
    if (warehouse.getCountDeliveredOrders() > 1500) {
      salary *= 3;
    }
  }

  @Override
  public String toString() {
    return "Picker{" + "salary=" + salary + '}';
  }
}
