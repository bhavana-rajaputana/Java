package com.bhavana;

import java.util.Scanner;

public class OneArray{
    public static void main(String[] args){
        int[] array=new int[10];
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Array Elements are");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        int small=array[0];
        for(int i=1;i<size;i++){
            if(array[i]<small){
                small=array[i];
            }
        }
        System.out.println("smallest is:"+small);
    }
}
