package org.silence.chapter1;

import org.junit.Assert;
import org.junit.Test;

public class Pratice1_1_9Test {

  private final int var1 = 10;
  private final int var2 = 9;

  @Test
  public void toBinaryString1() {
    String binaryString1 = Pratice1_1_9.toBinaryString1(var1);
    Assert.assertEquals("1010", binaryString1);
    String binaryString2 = Pratice1_1_9.toBinaryString1(var2);
    Assert.assertEquals("1001", binaryString2);
  }


  @Test
  public void toBinaryString2() {
    String binaryString1 = Pratice1_1_9.toBinaryString2(var1);
    Assert.assertEquals("1010", binaryString1);
    String binaryString2 = Pratice1_1_9.toBinaryString2(var2);
    Assert.assertEquals("1001", binaryString2);
  }

  @Test
  public void toBinaryString3() {
    String binaryString1 = Pratice1_1_9.toBinaryString3(var1);
    Assert.assertEquals("1010", binaryString1);
    String binaryString2 = Pratice1_1_9.toBinaryString3(var2);
    Assert.assertEquals("1001", binaryString2);
  }
}