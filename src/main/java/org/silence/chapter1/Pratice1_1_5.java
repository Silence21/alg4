package org.silence.chapter1;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 如果x,y大于0小于1则打印true，否者打印false
 *
 * @author silence
 * @create 2019-05-09 15:48
 */
public class Pratice1_1_5 {

  public static void main(String[] args) {
    double x = StdIn.readDouble();
    double y = StdIn.readDouble();
    if (x > 0 && y > 0 && x < 1 && y < 1) {
      StdOut.println("True");
    } else {
      StdOut.println("False");
    }
  }
}
