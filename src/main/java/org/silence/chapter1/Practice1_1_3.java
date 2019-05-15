package org.silence.chapter1;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * print equal or not equal
 *
 * @author silence
 * @create 2019-05-07 15:04
 */
public class Practice1_1_3 {

  public static void main(String[] args) {
    StdOut.println("Please input three number:");
    int a = StdIn.readInt();
    int b = StdIn.readInt();
    int c = StdIn.readInt();
    if (a == b && b == c) {
      StdOut.println("equal");
    } else {
      StdOut.println("not equal");
    }

  }
}
