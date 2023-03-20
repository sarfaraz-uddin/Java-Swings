package Swings;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setSize(400,500);
        frame.setTitle("HELLO WORLD!");//frame ko title mathi ko
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);//resize garna didaona frame lai
        frame.setVisible(true);//frame lai visible garauxha
        frame.getContentPane().setBackground(Color.BLACK);

        //button add garam
        JButton button=new JButton("Click Me!");
        JTextArea ta=new JTextArea();
        JButton btn=new JButton("Click Me!");
        JLabel label=new JLabel("Keep your text here");
        ta.setBounds(100,300,200,100);
        label.setBounds(140,200,200,100);
        label.setForeground(Color.white);
        button.setBounds(150,150,100,50);
        btn.setBounds(150,100,100,50);
        ta.setBackground(Color.RED);
        ta.setForeground(Color.WHITE);
        frame.add(ta);
        frame.add(label);
        frame.add(button);
        frame.add(btn);

    }
}
