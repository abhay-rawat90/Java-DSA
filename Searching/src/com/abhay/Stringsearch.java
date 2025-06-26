package com.abhay;

import java.util.Arrays;

public class Stringsearch {
    public static void main(String[] args) {
        String str = "abhay";
        char target = 'b';
        System.out.println(linearSearch(str,target));
    }
    static boolean linearSearch(String arr,char target)
    {
        if (arr.length()==0){
            return false;
        }
        for (char ch : arr.toCharArray()){
            if(target==ch)
            {
                return true;
            }



        }
        return false;

    }
}
