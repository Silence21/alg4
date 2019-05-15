package org.silence.chapter1;

/**
 * @author silence
 * @create 2019-05-10 15:01
 */
public class Practice1_1_20 {

  public static final int factorial(int N) {
    if (N == 1) {
      return 1;
    }
    return N * factorial(N - 1);
  }

  public static final double ln(int N){
    return Math.log(factorial(N));
  }
}
