package com.abhay;

import javax.swing.*;
import java.awt.*;

public class Myframe extends JFrame {
    Myframe(){
        this.setTitle("Jframe title goes here"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent frame from being resized

        this.setSize(420,420); // sets the x dim. and y dim.



        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("images(6).jpg"); // create an image icon

        this.setIconImage(image.getImage()); //change icon of frame

        this.getContentPane().setBackground(new Color(123,50,250)); // change the color of background

    }
}
