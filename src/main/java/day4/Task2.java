package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
  public static void main(String[] args) {
    int[] array = new int[100];
    Random random = new Random();
    int maxElement = array[array.length - 1];
    int minElement = array[0];
    int countElementZero = 0;
    int sumElementZero = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(10000);
    }
    for (int arr : array) {
      if (arr > maxElement) {
        maxElement = arr;
      }
      if (arr < minElement) {
        minElement = arr;
      }
      if (arr % 10 == 0) {
        countElementZero++;
        sumElementZero = sumElementZero + arr;
      }
    }
    System.out.println("Сгенерирован следующий массив:");
    System.out.println(Arrays.toString(array));
    System.out.println();
    System.out.println("Информация о массиве:");
    System.out.println("Наибольший элемент массива: " + maxElement);
    System.out.println("Наименьший элемент массива: " + minElement);
    System.out.println("Количество элементов массива, оканчивающихся на 0: " + countElementZero);
    System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sumElementZero);
  }
}
