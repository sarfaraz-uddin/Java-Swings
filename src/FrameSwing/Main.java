package FrameSwing;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setTitle("TO KAISE HAI APLOGE");
        JPanel panel=new JPanel();
        panel.setBackground(Color.WHITE);
        JPanel pnl=new JPanel();
        pnl.setBackground(Color.WHITE);

        JTextField tf=new JTextField("Enter Your name :");
        tf.setBackground(Color.BLACK);
        tf.setForeground(Color.WHITE);
        JTextField add=new JTextField("Enter address");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        JButton btn=new JButton("Click me!");
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        String country[]={"SELECT","India","Aus","U.S.A","England","Newzealand"};
        JComboBox cb=new JComboBox(country);
        cb.setBackground(Color.BLACK);
        cb.setForeground(Color.GRAY);
        JRadioButton radiobutton=new JRadioButton("MALE");
        radiobutton.setBackground(Color.BLACK);
        radiobutton.setForeground(Color.WHITE);
        JRadioButton rdb=new JRadioButton("Female");
        rdb.setBackground(Color.BLACK);
        rdb.setForeground(Color.WHITE);

        JTextField tff=new JTextField("Enter Your name :");
        tff.setBackground(Color.BLACK);
        tff.setForeground(Color.WHITE);
        JTextField addd=new JTextField("Enter address");
        addd.setBackground(Color.BLACK);
        addd.setForeground(Color.WHITE);
        JButton bttn=new JButton("Click me!");
        bttn.setBackground(Color.BLACK);
        bttn.setForeground(Color.WHITE);
        String city[]={"SELECT","India","Aus","U.S.A","England","Newzealand"};
        JComboBox cbb=new JComboBox(city);
        cbb.setBackground(Color.BLACK);
        cbb.setForeground(Color.GRAY);
        JRadioButton radiobuttonn=new JRadioButton("MALE");
        radiobuttonn.setBackground(Color.BLACK);
        radiobuttonn.setForeground(Color.WHITE);
        JRadioButton rddb=new JRadioButton("Female");
        rddb.setBackground(Color.BLACK);
        rddb.setForeground(Color.WHITE);

        panel.setBounds(10,10,250,350);
        //        label.setBounds(20,20,200,40);
        tf.setBounds(20,30,200,50);
        add.setBounds(20,90,200,50);
        cb.setBounds(20,150,100,50);
        radiobutton.setBounds(20,210,80,50);
        rdb.setBounds(130,210,80,50);
        btn.setBounds(20,270,200,50);

        pnl.setBounds(280,10,250,350);
        tff.setBounds(290,30,200,50);
        addd.setBounds(290,90,200,50);
        cbb.setBounds(290,150,100,50);
        radiobuttonn.setBounds(290,210,80,50);
        rddb.setBounds(400,210,80,50);
        bttn.setBounds(290,270,200,50);

        frame.add(panel);
        frame.add(pnl);
//        frame.add(label);
        frame.add(tf);
        frame.add(add);
        frame.add(btn);
        frame.add(cb);
        frame.add(radiobutton);
        frame.add(rdb);

        frame.add(tff);
        frame.add(addd);
        frame.add(bttn);
        frame.add(cbb);
        frame.add(radiobuttonn);
        frame.add(rddb);

        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(550,420);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

}
