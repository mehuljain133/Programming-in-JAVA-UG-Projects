// Swing Introduction to Swing, Swing vs. AWT, Hierarchy for Swing components, Creating GUI applications using Swing. 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Main class to demonstrate Swing components
public class SwingExample extends JFrame {

    // Constructor to set up GUI
    public SwingExample() {
        // Setting up the frame (JFrame)
        setTitle("Swing Example - Button Click");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());  // Set the layout manager for the frame

        // Swing Components
        JLabel label = new JLabel("Click the button to change this text!");
        JButton button = new JButton("Click Me!");
        JTextField textField = new JTextField(20);  // TextField to enter text

        // Add components to the frame
        add(label);
        add(button);
        add(textField);

        // Button Click Event Handling using ActionListener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change the label's text when the button is clicked
                label.setText("Button was clicked! You entered: " + textField.getText());
            }
        });

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Instantiate the SwingExample class to display the frame
        SwingExample example = new SwingExample();
    }
}

