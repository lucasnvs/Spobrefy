package com.spobrefy.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Input extends JPanel {
    JLabel labelInput;
    JTextField input;

    public Input(String label) {
        setLayout(new GridBagLayout());

        labelInput = new JLabel(label);
        input = new JTextField(20);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 0;
        gbc.gridy = 0;

        add(labelInput, gbc);

        gbc.gridy = 1;
        add(input, gbc);
    }
}