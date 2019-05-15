package org.silence.chapter1;


import org.junit.Test;

public class Pratice1_1_13Test {

  @Test
  public void printTransposedMatrix() {
    int row = 2;
    int line = 5;
    int maxValue = 10;
    int[][] matrix = Pratice1_1_13.randomInitMatrix(row, line, maxValue);
    Pratice1_1_13.printArray(matrix);
    System.out.println("-------------转置后----------------");
    Pratice1_1_13.printArray(Pratice1_1_13.transposeMatrix(matrix));
  }
}