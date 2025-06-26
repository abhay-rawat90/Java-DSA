package com.abhay;

import java.io.File;
import java.io.IOException;

public class newfile {
    public static void main(String[] args) {
        try{
            File fo = new File("new-file.txt");
            fo.createNewFile();
        } catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
