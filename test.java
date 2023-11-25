package com.bhavana;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
         int A=5;

        int a[]=new int[A];
        int newarr[]=new int[A];

        for (int i=0;i<A;i++){
            a[i]=i+1;
        }
/////////////////////////////////
        while(A>1){
            newarr=a;
           // Arrays.copyOf(newarr,a.length-1);
            int temp=newarr[newarr.length-1];
            for(int i=A-1;i>0;i--)
            {
                newarr[i]=newarr[i-1];
            }
            newarr[0]=temp;

            //int newarr[] = new int[A + 1];

          /*  for(int i=newarr.length-2;i>=0;i--){
                newarr[i+1]=i;
            }
            newarr[0]=temp;*/


            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] );
            }
            System.out.println();
            A--;

        }

            System.out.println(newarr[newarr.length-1]);

    }



}
