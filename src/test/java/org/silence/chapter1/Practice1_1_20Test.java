package org.silence.chapter1;

import org.junit.Assert;
import org.junit.Test;

public class Practice1_1_20Test {

  @Test
  public void factorial() {
    int N = 10;
    int factorial = Practice1_1_20.factorial(N);
    Assert.assertEquals(3628800,factorial);
  }

  @Test
  public void ln() {
    int N = 10;
    double ln = Practice1_1_20.ln(N);
    System.out.println(ln);
  }
}