// Write a program to create an Applet. Create a frame as a child of applet. ImplementmouseClicked( ), mouseEntered( ) and mouseExited( ) events for applet. Frame is visible when mouse enters applet window and hidden when mouse exits from the applet window

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Create an applet class that extends Applet and implements MouseListener
public class AppletWithFrame extends Applet implements MouseListener {

    // Declare a frame as a member variable
    Frame frame;

    // Initialize the applet
    public void init() {
        // Set the applet's layout to null (no layout)
        setLayout(null);

        // Create a new Frame object
        frame = new Frame("Applet Frame");
        // Set the size of the frame
        frame.setSize(300, 200);
        // Set the layout for the frame
        frame.setLayout(new FlowLayout());

        // Add a label to the frame for demonstration
        Label label = new Label("Mouse Listener Events");
        frame.add(label);

        // Add MouseListener to the applet
        addMouseListener(this);
    }

    // When the mouse is clicked inside the applet window
    public void mouseClicked(MouseEvent me) {
        // For this program, no action is required on mouseClicked
    }

    // When the mouse enters the applet window
    public void mouseEntered(MouseEvent me) {
        // Show the frame when the mouse enters the applet
        frame.setVisible(true);
    }

    // When the mouse exits the applet window
    public void mouseExited(MouseEvent me) {
        // Hide the frame when the mouse exits the applet
        frame.setVisible(false);
    }

    // Additional required mouse methods (no actions needed)
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}

    // Optional: Destroy method to clean up when the applet is destroyed
    public void destroy() {
        frame.dispose(); // Dispose of the frame when the applet is destroyed
    }
}
