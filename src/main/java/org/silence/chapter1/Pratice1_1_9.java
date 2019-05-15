package org.silence.chapter1;

/**
 * 求一个正整数的二进制
 *
 * @author silence
 * @create 2019-05-09 15:52
 */
public class Pratice1_1_9 {

  /**
   * 使用递归
   *
   * @param n 正整数
   */
  public static String toBinaryString1(int n) {
    if (0 == n / 2) {
      return n % 2 + "";
    }
    Object[] a = {1, 2, 3};
    return toBinaryString1(n / 2) + n % 2;
  }

  /**
   * 使用循环
   *
   * @param n 正整数
   */
  public static String toBinaryString2(int n) {
    String s = "";
    for (int i = n; i > 0; i /= 2) {
      s = (i % 2) + s;
    }
    return s;
  }

  /**
   * 使用java内置方法
   *
   * @param n 正整数
   */
  public static final String toBinaryString3(int n) {
    return Integer.toBinaryString(n);
  }
  //todo
  //研究java位运算的技巧
  public static String toBinaryString4(int value) {
    if (value == 0) {
      return "0";
    }
    int bufLen = 32;
    int index = bufLen;
    char[] result = new char[bufLen];
    do {
      // 使用 & 符合相对除 2 提升一定性能
      result[--index] = (char)('0' + (value & 1));
      value = value >>> 1;
    } while (value != 0);
    return new String(result, index, bufLen - index);
  }
}
