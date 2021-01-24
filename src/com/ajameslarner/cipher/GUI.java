package com.ajameslarner.cipher;

import javax.swing.*;
import java.awt.*;

public class GUI {

    private JPanel mainPanel = new JPanel();
    private JButton mainButton = new JButton("Encrypt.");
    private JLabel mainLabel = new JLabel("Caesar Cipher");

    public static void main(String[] args) {
        new GUI();

    }

    public GUI() {

       JFrame mainFrame = new JFrame();

        mainPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        mainPanel.setLayout(new GridLayout(3,1));
        mainPanel.add(mainButton);
        mainPanel.add(mainLabel);

        mainFrame.add(mainPanel, BorderLayout.CENTER);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Caesar Cipher");
        mainFrame.setResizable(true);
        mainFrame.setSize(500,500);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }
}
