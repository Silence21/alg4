package org.silence.chapter1;

/**
 * 求一个数的LogN
 *
 * @author silence
 * @create 2019-05-10 11:54
 */
public class Pratice1_1_14 {

  /**
   * 求不大于LogN的最大整数
   */
  public static int lg(int N) {
    if (N == 0) {
      return 0;
    }
    int time = 0;
    for (int i = N; i != 0; i /= 2) {
      time++;
    }
    return --time;
  }

  //todo
  //java位运算
  private static int lgCopy(int n) {
    int shiftRightCount = 0;
    do {
      n >>= 1;
      shiftRightCount++;
    } while (n != 0);
    return shiftRightCount - 1;
  }
}
