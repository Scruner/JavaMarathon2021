package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
  public static void main(String[] args) {
    int[] array = new int[100];
    int summ = 0;
    int trioMax = 0;
    int trioIndex = 0;
    Random random = new Random();
    for (int i = 0; i < array.length - 2; i++) {
      array[i] = random.nextInt(10000);
      summ = array[i] + array[i + 1] + array[i + 2];
      if (summ < trioMax) {
        trioMax = summ;
        trioIndex = i;
      }
    }
    System.out.println(Arrays.toString(array));
    System.out.println(summ);
    System.out.println(trioIndex);
  }
}
