import java.util.Arrays;

public class SortingAlgorithms {
  public static void bubbleSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      boolean isSorted = true;
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          isSorted = false;
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }

      if (isSorted) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    int[] input = { 5, 4, 3, 2, 1 };
    bubbleSort(input);
    System.out.println(Arrays.toString(input));
  }

}
