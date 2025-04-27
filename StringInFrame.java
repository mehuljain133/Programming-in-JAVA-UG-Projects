// Write a program to display a string in frame window with pink color as background. 

import java.awt.*;

public class StringInFrame {
    public static void main(String[] args) {
        // Create a new Frame object
        Frame frame = new Frame("String in Frame");

        // Set the size of the frame
        frame.setSize(400, 300);

        // Set the background color of the frame to pink
        frame.setBackground(Color.PINK);

        // Create a custom component to display the string
        // This class overrides the paint method to display the string
        frame.add(new CustomPanel());

        // Make the frame visible
        frame.setVisible(true);
        
        // Close the application when the frame is closed
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

// Custom panel to display the string
class CustomPanel extends Panel {
    // Override the paint method to draw the string
    public void paint(Graphics g) {
        // Set the font color to black
        g.setColor(Color.BLACK);
        // Draw the string in the center of the frame
        g.drawString("Hello, Welcome to Java!", 120, 150);
    }
}
