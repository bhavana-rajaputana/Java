package com.bhavana;

import java.util.Scanner;

public class inputArray {
    public static int[] arrinput(){

        System.out.println("Enter the required size of the array : ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int intArray[] = new int [size];
        System.out.println("Enter the elements of the array one by one ");
        for(int i=0; i<size; i++) {
            intArray[i] = s.nextInt();}
        return intArray;
    }

}
