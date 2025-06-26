package com.abhay;

import java.util.Arrays;
import java.util.HashMap;

public class practise {
    public static void main(String[] args) {
        int[] arr={10,5,10,15,10,5};
        check(arr);
    }
    static void check(int[] arr){
        HashMap<Integer,Integer> freqM=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            freqM.put(num,freqM.getOrDefault(num,0)+1);
        }
        int minf= arr.length;
        int maxf=1;
        int maxfnum=0;
        int minfnum=0;
        for (int i = 0; i < arr.length; i++) {

        }
        System.out.print(maxfnum+ " ");
        System.out.print(minfnum);
    }
}
//        int max=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        //precompute
//        int[] hash=new int[max+1];
//        for (int i = 0; i < arr.length; i++) {
//            hash[arr[i]]++;
//        }
//            int minf=Integer.MAX_VALUE;
//            int maxf=1;
//            int maxfnum=0;
//            int minfnum=0;
//        int i = 0;
//        while ( i < hash.length) {
//            if(hash[i]>maxf){
//                maxf=hash[i];
//                maxfnum=i;
//            }
//            i++;
//        }
//        int f = 0;
//        while ( f < hash.length) {
//            if(hash[f]<minf && hash[f]!=0){
//                minf=hash[f];
//                minfnum=f;
//                f++;
//            }else{
//                f++;
//            }
//        }
//   System.out.print(maxfnum+ " ");
//        System.out.print(minfnum);
