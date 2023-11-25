package com.bhavana;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        numbers[4]=3;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[][] numbers1=new int[2][3];
        numbers1[0][0]=1;
        System.out.println(Arrays.deepToString(numbers1));

    }
}
