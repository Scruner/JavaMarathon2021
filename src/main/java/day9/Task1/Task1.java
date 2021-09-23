package day9.Task1;

public class Task1 {
  public static void main(String[] args) {
    Student student = new Student("Ron", "FiveGroup");
    Teacher teacher = new Teacher("John Johnson", "mathematics");
    System.out.println(student.getGroupName());
    System.out.println(teacher.getSubjectName());
    student.printInfo();
    teacher.printInfo();
  }
}
