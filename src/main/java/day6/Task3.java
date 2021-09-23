package day6;

public class Task3 {
  public static void main(String[] args) {
    Teacher teacher = new Teacher("Иванов Иван Иванович", "Физика");
    Student student = new Student("Пётр Петров");
    teacher.evaluate(student);
  }
}
