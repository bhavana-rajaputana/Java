package com.bhavana;

import java.util.Scanner;

public class rubies {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=0,u=0,b=0,y=0;
        String sample=scan.next();
        for(int i=0;i<sample.length();i++){
           char a=sample.charAt(i) ;
           switch(a){
               case 'r':{r++;break;}
               case 'u':{u++;break;}
               case 'b':{b++;break;}
               case 'y':{y++;break;}
               default:continue;
           }
        }
        int x=Math.min(r,u);
        int l=Math.min(b,y);
        int z=Math.min(x,l);
        System.out.println(z);

    }
}
