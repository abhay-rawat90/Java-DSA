package com.abhay;

import javax.swing.*;

public class Label {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("FAVPNG_car-clip-art_EUTwPz3x.png");

        JLabel label = new JLabel(); // create a label
        label.setText("Bro do you even code ?"); //set text of label
        label.setIcon(image);




        JFrame frame = new JFrame(); // creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevent frame from being resized

        frame.setSize(1280,720); // sets the x dim. and y dim.
        frame.setVisible(true); // make frame visible

        frame.add(label);
    }
}
