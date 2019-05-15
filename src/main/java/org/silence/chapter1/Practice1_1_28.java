package org.silence.chapter1;

/**
 * 删除已排序数组中的重复元素
 *
 * @author silence
 * @create 2019-05-10 18:16
 */
public class Practice1_1_28 {

  /**
   * 删除数组中的重复元素
   *
   * @param array 已排序数组
   * @return 返回删除后数组的长度
   */
  public static int removeDuplicate(int[] array) {
    if (array.length == 0) {
      return 0;
    }
    int j = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[j] != array[i]) {
        array[++j] = array[i];
      }
    }
    return j + 1;
  }

}
