package com.bhavana;

public class median {
    public static void main(String[] args) {
        int a[] = {2, 5, 7, 8, 11};
        int b[] = {3, 4, 6, 9, 10};
        int c[] = new int[a.length + b.length];
        int x, y, z;
        x = a.length;
        y = b.length;
        z = x + y;
        int m = 0, n = 0,i=0;

            while (m < x && n < y) {
                if (a[n] > b[m]) {
                    c[i] = b[m];
                    m++;
                }
                else {
                    c[i] = a[n];
                    n++;
                }
                i++;
            }
            while(m<x){
                c[i]=b[m];
                m++;
                i++;
        }
        while(n<y){
            c[i]=a[n];
            n++;
            i++;
        }

            for (int p = 0; p < z; p++) {
                System.out.println(c[p] + " ");
            }

            if (z % 2 == 0) {
                System.out.println(c[z / 2] + " " + c[(z + 2) / 2]);
            } else {
                System.out.println(c[z / 2]);
            }

    }
}