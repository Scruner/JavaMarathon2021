package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int sum = 0;
    Random random = new Random();
    int countMoreEight = 0;
    int countOneNumber = 0;
    int countEvenNumber = 0;
    int countOddNumber = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(10);
      if (array[i] > 8) {
        countMoreEight++;
      }
      if (array[i] == 1) {
        countOneNumber++;
      }
      if (array[i] % 2 == 0) {
        countEvenNumber++;
      }
      if (array[i] % 2 != 0) {
        countOddNumber++;
      }
      sum = sum + array[i];
    }
    System.out.println("Сгенерирован следующий массив:");
    System.out.println(Arrays.toString(array));
    System.out.println();
    System.out.println("Информация о массиве:");
    System.out.println("Длина массива: " + array.length);
    System.out.println("Количество чисел больше 8: " + countMoreEight);
    System.out.println("Количество чисел равных 1: " + countOneNumber);
    System.out.println("Количество четных чисел: " + countEvenNumber);
    System.out.println("Количество нечетных чисел: " + countOddNumber);
    System.out.println("Сумма всех элементов массива: " + sum);
  }
}
