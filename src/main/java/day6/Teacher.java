package day6;

import java.util.Random;

public class Teacher {
  private String fio;
  private String item;

  public Teacher(String fio, String item) {
    this.fio = fio;
    this.item = item;
  }

  public String getFio() {
    return fio;
  }

  public void setFio(String fio) {
    this.fio = fio;
  }

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public void evaluate(Student student) {
    String grade = null;
    Random random = new Random();
    int gradeRandom = random.nextInt(4) + 2;
    switch (gradeRandom) {
      case 5 -> grade = "отлично";
      case 4 -> grade = "хорошо";
      case 3 -> grade = "удовлетворительно";
      case 2 -> grade = "неудовлетворительно";
    }
    System.out.println(
        "Преподаватель "
            + this.fio
            + " оценил студента с именем "
            + student.getFio()
            + " по предмету "
            + this.item
            + " на оценку "
            + grade);
  }
}
