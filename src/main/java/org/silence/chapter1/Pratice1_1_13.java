package org.silence.chapter1;

import java.util.Random;

/**
 * @author silence
 * @create 2019-05-09 22:21
 */
public class Pratice1_1_13 {

  /**
   * 转置打印矩阵,但不会转置矩阵
   */
  public static void printTransposedMatrix(int[][] matrix) {

    for (int j = 0; j < matrix[0].length; j++) {
      System.out.print("(");
      for (int i = 0; i < matrix.length; i++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println(")");
    }
  }

  /**
   * 打印矩阵
   */
  public static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print("(");
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println(")");
    }
  }

  /**
   * 随机初始化一个正整数矩阵
   *
   * @param row 行
   * @param line 列
   * @param elementMax 元素最大值
   */

  public static int[][] randomInitMatrix(int row, int line, int elementMax) {
    int[][] matrix = new int[row][line];
    Random random = new Random();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < row; j++) {
        matrix[i][j] = random.nextInt(elementMax);
      }
    }
    return matrix;
  }

  /**
   * 求一个矩阵的转置
   *
   * @param matrix 矩阵
   * @return 返回转置后的矩阵
   */
  //todo 转置矩阵的其他方法
  public static int[][] transposeMatrix(int[][] matrix) {
    int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        transposedMatrix[j][i] = matrix[i][j];
      }
    }
    return transposedMatrix;
  }
}
