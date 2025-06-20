package com.calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorApp {

    private static JTextField numField1;
    private static JTextField numField2;
    private static JTextField resultField;
    private static String operation = "";
    private static double firstNumber = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 500);

            // Create text fields
            numField1 = new JTextField();
            numField1.setEditable(true); // Explicitly set for clarity, though default
            numField2 = new JTextField();
            numField2.setEditable(false); // Set to non-editable
            resultField = new JTextField();
            resultField.setEditable(false);

            // Create buttons
            JButton[] digitButtons = new JButton[10];
            for (int i = 0; i < 10; i++) {
                digitButtons[i] = new JButton(String.valueOf(i));
                final String digit = String.valueOf(i);
                digitButtons[i].addActionListener(e -> {
                    if (operation.isEmpty()) {
                        numField1.setText(numField1.getText() + digit);
                    } else {
                        numField2.setText(numField2.getText() + digit);
                    }
                });
            }

            JButton addButton = new JButton("+");
            addButton.addActionListener(e -> {
                String num1Text = numField1.getText();
                if (num1Text.isEmpty()) {
                    resultField.setText("Numero real 1 no puede estar vacio");
                    numField2.setEditable(false); // Ensure numField2 is not editable
                    operation = ""; // Reset operation
                } else {
                    try {
                        firstNumber = Double.parseDouble(num1Text);
                        operation = "+";
                        numField2.setEditable(true); // Make editable
                        numField2.setText(""); // Clear numField2 for new input
                        numField2.requestFocusInWindow(); // Move focus to numField2
                    } catch (NumberFormatException ex) {
                        resultField.setText("Error: Numero real 1 invalido");
                        numField2.setEditable(false); // Ensure numField2 is not editable
                        operation = ""; // Reset operation on error
                    }
                }
            });

            JButton equalsButton = new JButton("=");
            equalsButton.addActionListener(e -> {
                if (!operation.isEmpty()) {
                    try {
                        double secondNumber = Double.parseDouble(numField2.getText());
                        double result = performOperation(firstNumber, secondNumber, operation);

                        resultField.setText(String.valueOf(result));
                        numField1.setText(String.valueOf(result)); // Result becomes the new Number 1
                        firstNumber = result; // Store for potential chained operations
                        numField2.setText(""); // Clear Number 2 field
                        numField2.setEditable(false); // Make non-editable after calculation
                        operation = ""; // Reset operation, ready for new one or new sequence
                        numField1.requestFocusInWindow(); // Set focus to numField1
                    } catch (NumberFormatException ex) { // Correctly closes try, starts catch
                        resultField.setText("Error: Invalid number in Number 2");
                        operation = ""; // Reset operation on error too
                        firstNumber = 0; // Reset firstNumber
                        numField2.setEditable(false); // Also make non-editable on error
                    } // Correctly closes catch
                } else { // If operation is empty (e.g. user presses = without an operation)
                    numField2.setEditable(false); // Ensure numField2 is not editable
                }
            });

            JButton clearButton = new JButton("C");
            clearButton.addActionListener(e -> {
                numField1.setText("");
                numField1.setEditable(true); // Ensure numField1 is editable
                numField1.setText("");
                numField2.setEditable(false); // Make numField2 non-editable
                numField2.setText("");
                resultField.setText("");
                operation = "";
                firstNumber = 0;
                numField1.requestFocusInWindow(); // Focus numField1 after clearing
            });

            // Create panel for text fields
            JPanel inputOutputPanel = new JPanel(new GridLayout(3, 2, 5, 5)); // Added gaps
            inputOutputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Added padding
            inputOutputPanel.add(new JLabel("Numero real 1:")); // Changed label
            inputOutputPanel.add(CalculatorApp.numField1); // Use static field
            inputOutputPanel.add(new JLabel("Numero real 2:")); // Changed label
            inputOutputPanel.add(CalculatorApp.numField2); // Use static field
            inputOutputPanel.add(new JLabel("Resultado:")); // Changed label
            inputOutputPanel.add(CalculatorApp.resultField); // Use static field

            // Create panel for buttons
            JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5)); // Added gaps
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Added padding

            // Row 1
            buttonPanel.add(digitButtons[7]);
            buttonPanel.add(digitButtons[8]);
            buttonPanel.add(digitButtons[9]);
            buttonPanel.add(addButton);

            // Row 2
            buttonPanel.add(digitButtons[4]);
            buttonPanel.add(digitButtons[5]);
            buttonPanel.add(digitButtons[6]);
            buttonPanel.add(new JPanel()); // Placeholder

            // Row 3
            buttonPanel.add(digitButtons[1]);
            buttonPanel.add(digitButtons[2]);
            buttonPanel.add(digitButtons[3]);
            buttonPanel.add(new JPanel()); // Placeholder

            // Row 4
            buttonPanel.add(clearButton);
            buttonPanel.add(digitButtons[0]);
            buttonPanel.add(equalsButton);
            buttonPanel.add(new JPanel()); // Placeholder


            // Add panels to frame
            frame.setLayout(new BorderLayout());
            frame.add(inputOutputPanel, BorderLayout.NORTH);
            frame.add(buttonPanel, BorderLayout.CENTER);

            frame.pack(); // Adjust frame size to components
            frame.setLocationRelativeTo(null); // Center the frame
            frame.setVisible(true);
        });
    }

    // Extracted method for testability
    public static double performOperation(double num1, double num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            // Future operations (subtract, multiply, divide) can be added here
            default:
                throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }
}
