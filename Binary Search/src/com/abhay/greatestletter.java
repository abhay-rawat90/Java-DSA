package com.abhay;

public class greatestletter {
    public static void main(String[] args) {
        char[] ch ={'c','f','j'};
        char target = 'c';
        System.out.println(greatest(ch,target));


    }
    static char greatest(char[] ch,char target)
    {
        int start= 0;
        int end= ch.length-1;
//        for (int i = start; i <=end ; i++) {
//            if(ch[i]>target)
//            {
//                return ch[i];
//            }
//
//        }
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            if(target<ch[mid])
            {
                end= mid-1;
            }
            else
            {
                start= mid+1;
            }
        }
        return ch[start%ch.length];
    }
}
