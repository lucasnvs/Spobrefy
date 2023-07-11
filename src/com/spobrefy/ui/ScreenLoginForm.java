package com.spobrefy.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class ScreenLoginForm extends JFrame {

    JTextField emailField = new JTextField();
    JPasswordField passwordField = new JPasswordField();

    public ScreenLoginForm() {
        setTitle("Spobrefy");
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        getContentPane().setLayout(new GridLayout(4, 1));

        JLabel title = new JLabel("Cadastro");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        add(title);

        add(new Input("Email"));
        add(new InputPassword("Senha"));

        JButton button = new JButton("Criar conta");
        button.setPreferredSize(new Dimension(200, 70));
        button.setForeground(new Color(255,255,255));
        button.setBackground(new Color(70,214, 46));
        add(button);

        button.addActionListener(this::but);
    }

    public void but(ActionEvent e) {

        // char[] pass = passwordField.getPassword();
        // String passwordString = new String(pass);

        // JOptionPane.showMessageDialog(null, emailField.getText() + passwordString, "Cadastro", JOptionPane.PLAIN_MESSAGE);
        // ScreenInitial screenInitial = new ScreenInitial();

        // screenInitial.setVisible(true);

        // setVisible(false);

        // dispose();
    }
}
