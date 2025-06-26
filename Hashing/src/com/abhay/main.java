package com.abhay;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;

class MapUsingHash {

    private Entity[] entities;
    public MapUsingHash(){
        entities = new Entity[100];

    }
    public void put(String key, String value)
    {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key,value);
    }

    public String get(String key)
    {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key))
        {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key)
    {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key))
        {
            entities[hash] = null;

        }

    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value)
        {
            this.key = key;
            this.value = value;
        }
    }
}

public class main {
    public static void main(String[] args) {
//        String name = "Abhay";
//        int code = name.hashCode();
//        System.out.println(code);
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Abhay", 99);
//        map.put("Rawat",90);
//        map.put("Praveen", 55);
//
//        System.out.println(map.get("Abhay"));
//        System.out.println(map.containsKey("Abhay"));
//
//        HashSet<Integer> set = new HashSet<>();
//        set.add(56);
//        set.add(45);
//        set.add(23);
//
//
//        System.out.println(set);

        HashmapFinal map = new HashmapFinal();
        map.put("Abhay", "Good BOy");
        map.put("Mango","King of fruits");
        System.out.println(map);


    }
}
