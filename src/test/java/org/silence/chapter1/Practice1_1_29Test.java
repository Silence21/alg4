package org.silence.chapter1;

import org.junit.Assert;
import org.junit.Test;

public class Practice1_1_29Test {

  @Test
  public void rank() {
    int[] array = {1, 1, 2, 4, 4, 5};
    int lowCount = Practice1_1_29.rank(array, 6);
    Assert.assertEquals(6, lowCount);
    lowCount = Practice1_1_29.rank(array, 5);
    Assert.assertEquals(5, lowCount);
    lowCount = Practice1_1_29.rank(array, 4);
    Assert.assertEquals(3, lowCount);
    lowCount = Practice1_1_29.rank(array, 1);
    Assert.assertEquals(0, lowCount);
    lowCount = Practice1_1_29.rank(array, 0);
    Assert.assertEquals(0, lowCount);
  }

  @Test
  public void count() {
    int[] array = {0, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10};
    int equalCount = Practice1_1_29.count(array, 6);
    Assert.assertEquals(4, equalCount);
    equalCount = Practice1_1_29.count(array, 5);
    Assert.assertEquals(1, equalCount);
    equalCount = Practice1_1_29.count(array, 10);
    Assert.assertEquals(1, equalCount);
    equalCount = Practice1_1_29.count(array, 0);
    Assert.assertEquals(1, equalCount);
    equalCount = Practice1_1_29.count(array, 100);
    Assert.assertEquals(0, equalCount);
    equalCount = Practice1_1_29.count(array, -1);
    Assert.assertEquals(0, equalCount);
  }
}