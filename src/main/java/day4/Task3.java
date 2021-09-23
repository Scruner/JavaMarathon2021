package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
  public static void main(String[] args) {
    int[][] array = new int[12][8];
    int[] sum = new int[array.length];
    int maxElement = 0;
    int maxIndex = 0;
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = random.nextInt(50);
        sum[i] += array[i][j];
      }
    }
    for (int i = 0; i < sum.length; i++) {
      if (sum[i] >= maxElement) {
        maxElement = sum[i];
        maxIndex = i;
      }
    }
    System.out.println(Arrays.deepToString(array)
            .replace("], ", "]\n"));
    System.out.println();
    System.out.println("Суммы чисел строк: " + Arrays.toString(sum));
    System.out.println("Максимальное число: " +maxElement);
    System.out.println("Индекс строки, сумма чисел в которой " +
            "максимальна: " + maxIndex);
  }
}
