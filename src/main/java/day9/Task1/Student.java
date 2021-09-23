package day9.Task1;

public class Student extends Human {
  private String groupName;

  public Student(String name, String GroupName) {
    super(name);
    this.groupName = GroupName;
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public void  printInfo() {
    super.printInfo();
    System.out.println("Этот студент с именем " + getName());
  }
}
