package com.bhavana;

import java.util.Arrays;

import static com.bhavana.inputArray.arrinput;


public class selection {

    public static void main(String[] args) {

        int[] intArray = arrinput();
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
            System.out.println(Arrays.toString(intArray));
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}