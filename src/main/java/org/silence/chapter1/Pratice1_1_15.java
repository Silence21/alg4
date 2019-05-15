package org.silence.chapter1;

/**
 * @author silence
 * @create 2019-05-10 12:35
 */
public class Pratice1_1_15 {
  //todo 只需要循环一次就可以计算指定范围内的各个元素的次数，但如果数组中存在负数，则不行

  public static final int[] histogram(int[] array, int M) {
    long startTime = System.currentTimeMillis();
    long endTime = System.currentTimeMillis();

    int[] mArray = new int[M];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0 && array[i] < M) {
        mArray[array[i]]++;
      }
    }
    return mArray;
  }
}
