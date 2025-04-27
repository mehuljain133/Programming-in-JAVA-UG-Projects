//Create an applet which responds to KEY_TYPED event and updates the status window with message (“Typed character is: X”). Use adapter class for other two events.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Create an applet class that extends Applet
public class KeyEventApplet extends Applet {

    // Text area for displaying the status message
    TextArea statusArea;

    // Initialize the applet
    public void init() {
        // Set the applet layout
        setLayout(new BorderLayout());

        // Create a TextArea to display the status message
        statusArea = new TextArea("Status: Waiting for key events...", 5, 40);
        statusArea.setEditable(false); // Make the TextArea non-editable

        // Add the status area to the applet
        add(statusArea, BorderLayout.CENTER);

        // Add KeyListener using an anonymous inner class
        addKeyListener(new KeyAdapter() {
            // Override keyTyped method to capture the typed character
            public void keyTyped(KeyEvent ke) {
                char typedChar = ke.getKeyChar(); // Get the character typed
                statusArea.setText("Typed character is: " + typedChar);
            }

            // Override keyPressed method to handle key press events (using the adapter class)
            public void keyPressed(KeyEvent ke) {
                statusArea.append("\nKey pressed: " + ke.getKeyCode());
            }

            // Override keyReleased method to handle key release events (using the adapter class)
            public void keyReleased(KeyEvent ke) {
                statusArea.append("\nKey released: " + ke.getKeyCode());
            }
        });

        // Set focus on the applet so it can receive key events
        setFocusable(true);
    }
}
