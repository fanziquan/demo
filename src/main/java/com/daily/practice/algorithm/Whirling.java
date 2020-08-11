package com.daily.practice.algorithm;

/**
 * @author :fanzq HW2120
 * @version : whirling.java, v 0.1 2020/08/09 16:55 Exp $
 * @description :
 * 将一个矩阵顺时针旋转90°，请写出伪代码；
 * A11，A12，A13，					  A31，A21，A11，
 * A21，A22，A23，  ——顺时针旋转90°——》  A32，A22，A12，
 * A31，A32，A33，                     A33，A23，A13，
 */
public class Whirling {

    public static void main(String[] args) {
        String[][] arrs = {{"A11", "A12", "A13"}, {"A21", "A22", "A23"}, {"A31", "A32", "A33"}};
        String[][] newArray = getInfo(arrs);

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static String[][] getInfo(String[][] arrs) {
        String[][] newArray = new String[3][3];
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                newArray[j][2 - i] = arrs[i][j];
            }
        }
        return newArray;
    }
}
