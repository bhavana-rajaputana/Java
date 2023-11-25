package com.bhavana;

import java.util.*;
        class TwoArray{
public static void main(String[] args){
        int[][] array=new int[5][5];
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
        array[i][j]=scan.nextInt();
        }
        }
        System.out.println("Array Elements are");
        for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
        System.out.println(array[i][j]+" ");
        }
        System.out.println();
        }
        int small=array[0][0];
        for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
        if(array[i][j]<small){
        small=array[i][j];
        }
        }
        }
        System.out.println("smallest is:"+small);
        }
        }