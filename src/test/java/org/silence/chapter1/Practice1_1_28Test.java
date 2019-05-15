package org.silence.chapter1;

import org.junit.Assert;
import org.junit.Test;

public class Practice1_1_28Test {

  @Test
  public void removeDuplicate() {
    int[] array = {0,0,0,0,0,0};
    int len = Practice1_1_28.removeDuplicate(array);
    Assert.assertEquals(1,len);
  }
}