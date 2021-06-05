package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Cal extends JFrame implements ActionListener{
      JTextField t1,t2;
      JButton b1,b2,b3,b4;
      JLabel l1,l2;
      Container c;
//      JButton ADD,SUB,MUL,DIV;
      JLabel Result;
    Cal()
    {
        setTitle("Calculater");
        setBounds(500,300,300,300);
        c=getContentPane();
        c.setLayout(null);
        t1=new JTextField();
        t2=new JTextField();
        t1.setBounds(450,100,50,20);
        t2.setBounds(450,150,50,20);
        l1=new JLabel("Enter the value of A:");
        l2=new JLabel("Enter the value of B:");
        Result=new JLabel("Result:");
        l1.setBounds(300,100,200,20);
        l2.setBounds(300,150,200,20);
        Result.setBounds(300,400,200,20);
        b1=new JButton("ADD");
        b1.setBounds(180,300,80,20);
        b2=new JButton("SUB");
        b2.setBounds(280,300,80,20);
        b3=new JButton("MUL");
        b3.setBounds(380,300,80,20);
        b4=new JButton("DIV");
        b4.setBounds(480,300,80,20);
        c.add(t1);
        c.add(t2);
        c.add(l1);
        c.add(l2);
        c.add(Result);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1)
       {
         int a=Integer.parseInt(t1.getText());
         int b=Integer.parseInt(t2.getText());
         int c=a+b;
         Result.setText("the result is:"+c);

       }
        if(e.getSource()==b2)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a-b;
            Result.setText("the result is:"+c);

        }
        if(e.getSource()==b3)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a*b;
            Result.setText("the result is:"+c);

        }
        if(e.getSource()==b4)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a/b;
            Result.setText("the result is:"+c);

        }
    }
}
public class Addition_In_Swing {
    public static void main(String[] args) {
     Cal c=new Cal();
    }
}
