package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        //frame.add(panel);

        JTextField inputField1 = new JTextField(10);
        JTextField inputField2 = new JTextField(10);
        JTextField outputField = new JTextField(10);
        outputField.setEditable(false);

        inputField1.setFont(new Font("Arial", Font.PLAIN, 30));
        inputField2.setFont(new Font("Arial", Font.PLAIN, 30));
        outputField.setFont(new Font("Arial", Font.PLAIN, 30));

        JLabel label1 = new JLabel("Primeiro número:");
        JLabel label2 = new JLabel("Segundo número:");
        JLabel label3 = new JLabel("Resultado:");

        panel.add(label1);
        panel.add(inputField1);
        panel.add(label2);
        panel.add(inputField2);
        panel.add(label3);
        panel.add(outputField);

        String[] buttonLabels = {
                "Somar", "Subtrair", "Multiplicar", "Dividir"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 30));
            panel.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double num1, num2, result = 0;
                    Calculadora calc = new Calculadora();

                    try {
                        num1 = Double.parseDouble(inputField1.getText());
                        num2 = Double.parseDouble(inputField2.getText());

                        if (label.equals("Somar")) {
                            result = calc.somar(num1, num2);
                        } else if (label.equals("Subtrair")) {
                            result = calc.subtrair(num1, num2);
                        } else if (label.equals("Multiplicar")) {
                            result = calc.multiplicar(num1, num2);
                        } else if (label.equals("Dividir")) {
                            if (num2 != 0) {
                                result = calc.dividir(num1, num2);
                            } else {
                                outputField.setText("Erro, divisão por zero");
                                return;
                            }
                        }
                        outputField.setText(Double.toString(result));
                    } catch (NumberFormatException ex) {
                        outputField.setText("Erro: entrada inválida");
                    }

                }





            });

        }

        frame.add(panel);
        frame.setVisible(true);
    }
}