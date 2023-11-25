package com.bhavana;

import java.util.Scanner;

public class typecast {
    public static void main(String[] args) {
        //implicit   byte>short>int>long>float>double
        short x=1;
        int y=x+2;
        System.out.println(y);
        //explicit
        double x1=1.1;
        int y1= (int) x1+2;
        System.out.println(y1);

    }
}


