// Write a program to create an Applet that has two buttons named “Red” and “Blue”. Whena button is pressed the background color of the applet is set to the color named by thebutton’s label. 

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Create an applet class that extends Applet and implements ActionListener
public class ColorChangeApplet extends Applet implements ActionListener {

    // Declare two buttons
    Button redButton, blueButton;

    // Initialize the applet
    public void init() {
        // Set the applet's layout to FlowLayout
        setLayout(new FlowLayout());

        // Create the "Red" button and add action listener
        redButton = new Button("Red");
        redButton.addActionListener(this);

        // Create the "Blue" button and add action listener
        blueButton = new Button("Blue");
        blueButton.addActionListener(this);

        // Add buttons to the applet
        add(redButton);
        add(blueButton);
    }

    // This method is called when either button is pressed
    public void actionPerformed(ActionEvent ae) {
        // Check which button was clicked and set the background color accordingly
        if (ae.getSource() == redButton) {
            setBackground(Color.RED); // Set background to red
        } else if (ae.getSource() == blueButton) {
            setBackground(Color.BLUE); // Set background to blue
        }
    }
}
