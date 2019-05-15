package org.silence.chapter1;

/**
 * @author silence
 * @create 2019-05-10 15:48
 */
public class Practice1_1_22 {


  public static final int binarySearchRecursion(int[] array, int key) {
    int index = binarySearch(array, key, 0, array.length - 1);
    return index;
  }

  private static final int binarySearch(int[] array, int key, int low, int hig) {
    if (hig < low) {
      return -1;
    }
    int mid = low + (hig - low) / 2;
    if (key > array[mid]) {
      return binarySearch(array, key, mid + 1, hig);
    } else if (key < array[mid]) {
      return binarySearch(array, key, low, mid - 1);
    }
    return mid;
  }

  public static final int binarySearchLoop(int[] array, int key) {
    int low = 0;
    int hig = array.length - 1;
    while (low <= hig) {
      int mid = low + (hig - low) / 2;
      if (key > array[mid]) {
        low = mid + 1;
      } else if (key < array[mid]) {
        hig = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
