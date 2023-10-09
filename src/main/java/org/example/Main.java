package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label1 = new JLabel("Primeiro número:");
        panel.add(label1);
        JTextField textField1 = new JTextField(10);
        panel.add(textField1);

        JLabel label2 = new JLabel("Segundo número:");
        panel.add(label2);
        JTextField textField2 = new JTextField(10);
        panel.add(textField2);

        JLabel label3 = new JLabel("Resultado:");
        panel.add(label3);
        JTextField textField3 = new JTextField(10);
        panel.add(textField3);

        JButton buttonSomar = new JButton("Somar");
        buttonSomar.setBounds(30, 300, 100, 30);
        panel.add(buttonSomar);

        buttonSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stringN1 = textField1.getText();
                String stringN2 = textField2.getText();
                int n1 = Integer.parseInt(stringN1);
                int n2 = Integer.parseInt(stringN2);
                textField3.setText(String.valueOf(n1 + n2));
            }
        });

        frame.setVisible(true);
    }
}