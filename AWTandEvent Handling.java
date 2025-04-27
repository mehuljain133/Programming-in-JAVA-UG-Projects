// AWT and Event Handling: The AWT class hierarchy, Events, Event sources, Event classes, Event Listeners, Relationship between Event sources and Listeners, Delegation event model, Creating GUI applications using AWT.

import java.awt.*;
import java.awt.event.*;

// Main class extending Frame to create GUI components
public class AWTEventHandlingExample extends Frame {

    // Constructor for setting up the GUI
    public AWTEventHandlingExample() {
        // Create components
        Button clickButton = new Button("Click Me!");
        Label resultLabel = new Label("Click the button to change the text.");

        // Set the layout for the frame
        setLayout(new FlowLayout());

        // Add components to the frame
        add(clickButton);
        add(resultLabel);

        // Define a click event listener for the button
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("Button was clicked!");  // Change label text on button click
            }
        });

        // Frame settings
        setTitle("AWT Event Handling Example");
        setSize(300, 200);
        setVisible(true);

        // Window close listener
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);  // Close the application when the window is closed
            }
        });
    }

    public static void main(String[] args) {
        // Instantiate and display the GUI
        new AWTEventHandlingExample();
    }
}
