package com.abhay;

import java.util.ArrayList;
import java.util.List;

public class leet1408 {
    public static void main(String[] args) {
        String[] words = {"zjc","ezjc","xtwo","zzjc","jwx","awzzjcv"};
        System.out.println(stringMatching(words));

    }

    public static List<String> stringMatching(String[] words) {
        List<String> str = new ArrayList<>();
        for(int i = 0;i < words.length;i++)
        {
            for (int j = i+1; j < words.length; j++) {
                if(words[i].contains(words[j]) == true)
                {
                    str.add(words[j]);
                }

                else if(words[j].contains(words[i]) == true)
                {
                    str.add(words[i]);
                }


            }

        }
        int i = 0;
        int j = 1;

        while(i < str.size() - 1)
        {
            if(str.get(i).equals(str.get(j)))
            {
                str.remove(j);
            }
            else{
                i++;
            }
        }

        return str;

    }
}
