package org.silence.chapter1;

/**
 * @author silence
 * @create 2019-05-09 19:38
 */
public class Pratice1_1_11 {


  public static boolean[][] initArray(int row, int line) {
    boolean[][] bArray = new boolean[row][line];
    for (int i = 0; i < bArray.length; i++) {
      for (int j = 0; j < bArray[i].length; j++) {
        bArray[i][j] = (Math.random() > 0.5) ? true : false;
      }
    }
    return bArray;
  }

  /**
   * 打印boolean矩阵，使用*代替True，使用“ ”代替False
   */
  public static void printBooleanArray(boolean[][] matrix) {
    System.out.print(" ");
    //打印列号
    for (int i = 0; i < matrix[0].length; i++) {
      System.out.print(i);
    }
    System.out.println();
    //遍历数组元素
    for (int i = 0; i < matrix.length; i++) {
      //打印行号
      System.out.print(i);
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] ? "*" : " ");
      }
      System.out.println();
    }
  }

  public static void printBooleanMatrixCopy(boolean[][] matrix) {
    System.out.print(' ');
    for (int i = 0; i < matrix[0].length; i++) {
      System.out.print(i);
    }
    System.out.println();
    for (int i = 0; i < matrix.length; i++) {
      System.out.print(i);
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] ? '*' : ' ');
      }
      System.out.println();
    }
  }

  /**
   * todo 如何打印任意类型矩阵，使用泛型？如何实现？
   */
  public static void printBooleanMatrix(boolean[][] matrix) {
    System.out.print(" ");
    //打印列号
    for (int i = 0; i < matrix[0].length; i++) {
      System.out.print(i);
    }
    System.out.println();
    //遍历数组元素
    for (int i = 0; i < matrix.length; i++) {
      //打印行号
      System.out.print(i);
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
  }
}
