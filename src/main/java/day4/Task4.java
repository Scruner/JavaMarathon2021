package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
  public static void main(String[] args) {
    int[] array = new int[100];
    int summ;
    int trioMax = 0;
    int trioIndex = 0;
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(10000);
    }
    for (int i = 0; i < array.length - 2; i++) {
      summ = 0;
      for (int j = 0; j < i + 3; j++) {
        summ += array[i];
      }
      if (summ > trioMax) {
        trioMax = summ;
        trioIndex = i;
      }
    }
    System.out.println(Arrays.toString(array));
    System.out.println(trioMax);
    System.out.println(trioIndex);
  }
}
