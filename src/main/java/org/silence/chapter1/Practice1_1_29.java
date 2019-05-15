package org.silence.chapter1;

/**
 * @author silence
 * @create 2019-05-11 17:24
 */
public class Practice1_1_29 {


  /**
   * 查找给定有序数组array中，小于key的元素个数
   *
   * @return 小于N的元素个数, 若没有返回-1
   */
  public static final int rank(int[] array, int key) {
    if (array.length < 1) {
      return 0;
    }
    int lo = 0;
    int hi = array.length - 1;
    if (key < array[0]) {
      return 0;
    } else if (key > array[hi]) {
      return array.length;
    }
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (key < array[mid]) {
        hi = mid - 1;
      } else if (key > array[mid]) {
        lo = mid + 1;
      } else if (key == array[mid]) { //数组中存在该元素
        //如果数组中存在此元素，则向前遍历寻找比它小的元素，并返回此元素的下标加1，即为元素个数
        for (int i = mid - 1; i >= lo; i--) {
          if (array[i] < key) {
            return ++i;
          }
        }
        //如果以上遍历没有比给定元素小的元素，则下标lo正好是小于该元素的数量
        return lo;
      } else if (lo == hi) { //数组中不存在该元素
        return mid;
      }
    }
    return 0;
  }

  /**
   * 查找有序数组中key的个数
   *
   * @return 若不存在返回0
   */
  public static int count(int[] array, int key) {
    int count = 0;
    if (array.length < 1) {
      return count;
    }
    int lo = 0;
    int hi = array.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (key < array[mid]) {
        hi = mid - 1;
      } else if (key > array[mid]) {
        lo = mid + 1;
      } else if (key == array[mid]) {
        int i = mid;
        while (i >= lo && array[i] == key) {
          count++;
          i--;
        }
        i = mid + 1;
        while (i <= hi && array[i] == key) {
          count++;
          i++;
        }
        return count;
      }
    }
    return count;
  }
}
