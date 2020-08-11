package com.daily.practice.sort;

import java.util.Arrays;

/**
 * @author :fanzq HW2120
 * @version : MargeSort.java, v 0.1 2020/08/05 23:30 Exp $
 * @description : 归并排序算法
 */
public class MargeSort {


    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 1, 3, 7, 0, 6};

        int[] sort = margeSort(array);
        for (int i : sort) {
            System.out.print(i+ "\t");
        }

    }


    public static int[] margeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        return marge(margeSort(left), margeSort(right));
    }

    public static int[] marge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] > right[j]) {
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;
    }
}
