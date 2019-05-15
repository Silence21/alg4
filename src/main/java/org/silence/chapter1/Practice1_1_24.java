package org.silence.chapter1;

import edu.princeton.cs.algs4.StdIn;

/**
 * @author silence
 * @create 2019-05-10 16:56
 */
public class Practice1_1_24 {

  public static void main(String[] args) {
    euclid();
  }

  public static final void euclid() {
    int p = StdIn.readInt();
    int q = StdIn.readInt();
    int gcd = gcdLoop(p, q);
    System.out.println();
    System.out.printf("%d 和 %d的最大公约数是：%d", p, q, gcd);
  }

  private static final int gcd(int p, int q) {
    System.out.printf("p:%d,q:%d", p, q);
    System.out.println();
    if (q == 0) {
      return p;
    }
    int r = p % q;
    return gcd(q, r);
  }

  private static final int gcdLoop(int p, int q) {
    int a = p;
    int b = q;
    while (b != 0) {
      int r = (a > b) ? (a % b) : (b % a);
      a = (a > b) ? b : a;
      b = r;
    }
    return a;
  }
}
