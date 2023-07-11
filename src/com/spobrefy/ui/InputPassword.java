package com.spobrefy.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class InputPassword extends JPanel {
    JLabel labelInput;
    JPasswordField input;

    public InputPassword(String label) {
        setLayout(new GridBagLayout());

        labelInput = new JLabel(label);
        input = new JPasswordField(20);
        input.setSize(getPreferredSize());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 0;
        gbc.gridy = 0;

        add(labelInput, gbc);

        gbc.gridy = 1;
        add(input, gbc);
    }
}