package com.company;
import javax.swing.*;
import java.awt.*;
public class JTextField1{
    public static void main(String[] args)
    {
        JFrame jf=new JFrame();
        jf.setBounds(12,15,100,100);
        Container c=jf.getContentPane();
        c.setLayout(null);
        JTextField jt=new JTextField();
        jt.setBounds(100,100,100,20);
        c.add(jt);
        jf.setVisible(true);

    }
}
