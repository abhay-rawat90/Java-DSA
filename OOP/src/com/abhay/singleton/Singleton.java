package com.abhay.singleton;

public class Singleton {
    private Singleton (){



    }

    private static Singleton instance;

    public static Singleton getInstance()
    {
        // check whether one object is created or not
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;

    }
}
