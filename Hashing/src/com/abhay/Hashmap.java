package com.abhay;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        hashmapexamples();

    }

    static void hashmapexamples(){
        Map<String,Integer> mp = new HashMap<>();//syntax
        mp.put("Akash",21);//adding elements
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rashinka",19);
        mp.put("Harry",18);

        System.out.println(mp.get("Yash"));//getting value of a  key
        System.out.println(mp.get("rahul"));//null
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));
        System.out.println(mp.remove("Akash"));;//removing a pair from hashmap
        System.out.println(mp.remove("Riya"));

        System.out.println(mp.containsKey("Yash")); //checking if a key is in hashmap or not
        mp.putIfAbsent("Yash",30); //adding  a elemnt if new key doesn't exists already

        System.out.println(mp.keySet());// getting all keys
        System.out.println(mp.values());//getting all values

        System.out.println(mp.entrySet());//getting all values

        //traversing all entries of hashmap : multiple methods
        for (String key : mp.keySet())
        {
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();

        for (Map.Entry<String,Integer> e : mp.entrySet())
        {
            System.out.printf("Age is %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();

        for (var e : mp.entrySet())
        {
            System.out.printf("Age is %s is %d\n",e.getKey(),e.getValue());
        }


    }
}
