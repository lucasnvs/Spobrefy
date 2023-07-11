package com.spobrefy.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class ScreenInitial extends JFrame{
    private JPanel pnlSidebar;

    public ScreenInitial() {
        setTitle("Início");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        getContentPane().setLayout(new BorderLayout(5, 5));
        
        add(getPnlSidebar(), BorderLayout.WEST);

        setVisible(true);
    }

    public JPanel getPnlSidebar() {
        if(pnlSidebar == null) {
            pnlSidebar = new JPanel(new GridLayout(3, 1, 10, 10));

            JButton btn1 = new JButton("Ai meu deus!");
            JButton btn2 = new JButton("Ai meu deus!");
            JButton btn3 = new JButton("Ai meu deus!");

            Dimension btnSize = new Dimension(100, 50);

            btn1.setPreferredSize(btnSize);
            btn2.setPreferredSize(btnSize);
            btn3.setPreferredSize(btnSize);

            pnlSidebar.add(btn1);
            pnlSidebar.add(btn2);
            pnlSidebar.add(btn3);
            pnlSidebar.setBackground(new Color(18, 18, 18, 1));
        }
        return pnlSidebar;
    }
}
