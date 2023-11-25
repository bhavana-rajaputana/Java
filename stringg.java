package com.bhavana;
import java.util.ArrayList;
import java.util.Arrays;

public class stringg {
    public static void main(String[] args) {
        String str = "aaa bb ccccccc";
int min=0;int max = 0;
        String strs[] = str.split(" ");
        Arrays.sort(strs);
        int len=strs.length;
        for(int i=0;i<len-1;i++ ){
            for(int j=i+1;j< len-1;i++ ){
                if(strs[j].length()> strs[i].length()) {
                    max=j;}
}
    }
        System.out.println(strs[max]);
    }
}

