package day11.task1;

public class Courier implements Worker {
  private int salary;
  private Warehouse warehouse;

  public int getSalary() {
    return salary;
  }

  public Courier(Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  @Override
  public void doWork() {
    salary += 100;
    warehouse.setBalance(warehouse.getBalance() + 1000);
  }

  @Override
  public void bonus() {
    if (warehouse.getBalance() == 1_000_000) {
      salary *= 2;
    } else if (warehouse.getBalance() < 1_000_000) {
      System.out.println("Бонус пока не доступен");
    } else {
      System.out.println("Бонус уже был выплачен");
    }
  }

  @Override
  public String toString() {
    return "Courier{" + "salary=" + salary + '}';
  }
}
