package org.silence.chapter1;

import org.junit.Test;

public class Pratice1_1_11Test {

  @Test
  public void printArray() {
    int row = 5;
    int line = 5;
    boolean[][] matrix = Pratice1_1_11.initArray(row, line);
    Pratice1_1_11.printBooleanMatrix(matrix);
    System.out.println("-------------------------");
    Pratice1_1_11.printBooleanArray(matrix);
  }

  @Test
  public void printBooleanMatrix() {
    int row = 5;
    int line = 5;
    boolean[][] matrix = Pratice1_1_11.initArray(row, line);
    Pratice1_1_11.printBooleanMatrixCopy(matrix);
  }
}