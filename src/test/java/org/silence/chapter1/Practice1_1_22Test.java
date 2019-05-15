package org.silence.chapter1;

import org.junit.Assert;
import org.junit.Test;

public class Practice1_1_22Test {

  public int[] init() {
    int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    return a;
  }

  @Test
  public void binarySearchRecursion() {
    int[] a = init();
    int i = Practice1_1_22.binarySearchRecursion(a, 9);
    Assert.assertEquals(9, i);
  }

  @Test
  public void binarySearchLoop() {
    int[] a = init();
    int i = Practice1_1_22.binarySearchLoop(a, 0);
    Assert.assertEquals(0, i);
  }
}