package com.company;
import javax.swing.*;
import java.awt.event.*;
public class JFrame1{
    public static void main(String[] args) {
        JFrame frame=new JFrame();//creating the forms using the Jframe Class
        frame.setTitle("First App");//setting the title
        frame.setBounds(100,100,60,70);//providing the x,y,width,height
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);




    }
}
