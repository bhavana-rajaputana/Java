package com.bhavana;

public class longestincsubseq {
    public static void main(String[] args) {
        int arr[]={50,3,10,7,40,80};
        int lis[]={1,1,1,1,1,1};
        for(int i=1;i<6;i++)
            for(int j=0;j<i;j++)
                if(arr[i]>arr[j]&&lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
        for(int i=0;i<6;i++) {
            System.out.print(lis[i]+" ");
        }

        }
}
