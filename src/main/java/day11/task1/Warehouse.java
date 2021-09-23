package day11.task1;

public class Warehouse {
  private int countDeliveredOrders;
  private int balance;

  public int getCountDeliveredOrders() {
    return countDeliveredOrders;
  }

  public void setCountDeliveredOrders(int countDeliveredOrders) {
    this.countDeliveredOrders = countDeliveredOrders;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Warehouse{" + "countOrder=" + countDeliveredOrders + ", balance=" + balance + '}';
  }
}
