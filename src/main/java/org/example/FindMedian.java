package org.example;

import java.util.Arrays;

public class FindMedian {
    public static int[] findMedianNumber (int array1[], int array2[]){
        int combinedLength = array1.length + array2.length;

        int combinedArray [] = new int[combinedLength];
        System.arraycopy(array1, 0,combinedArray, 0, array1.length);
        System.arraycopy(array2, 0, combinedArray, array1.length, array2.length);

        return combinedArray;
    }
}
