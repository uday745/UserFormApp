package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserFormApp extends JFrame {

    public UserFormApp() {
        setTitle("User Information Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Load background image from resources
        ImageIcon backgroundIcon = new ImageIcon(getClass().getResource("/background.jpg"));
        JLabel backgroundLabel = new JLabel(backgroundIcon);
        backgroundLabel.setLayout(new GridBagLayout()); // Allows placing components over image
        setContentPane(backgroundLabel);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField usernameField = new JTextField(20);
        JTextField emailField = new JTextField(20);
        JTextField cityField = new JTextField(20);
        JTextField mobileField = new JTextField(20);
        JButton submitButton = new JButton("Submit");

        gbc.gridx = 0;
        gbc.gridy = 0;
        backgroundLabel.add(new JLabel("Username:"), gbc);
        gbc.gridx = 1;
        backgroundLabel.add(usernameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        backgroundLabel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        backgroundLabel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        backgroundLabel.add(new JLabel("City:"), gbc);
        gbc.gridx = 1;
        backgroundLabel.add(cityField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        backgroundLabel.add(new JLabel("Mobile:"), gbc);
        gbc.gridx = 1;
        backgroundLabel.add(mobileField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        backgroundLabel.add(submitButton, gbc);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String info = "Username: " + usernameField.getText() +
                        "\nEmail: " + emailField.getText() +
                        "\nCity: " + cityField.getText() +
                        "\nMobile: " + mobileField.getText();
                JOptionPane.showMessageDialog(null, info);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UserFormApp());
    }
}

