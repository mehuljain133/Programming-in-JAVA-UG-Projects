// Create an applet with two buttons labeled ‘A’ and ‘B’. When button ‘A’ is pressed, itdisplays your personal information (Name, Course, Roll No, College) and when button ‘B’is pressed, it displays your CGPA in previous semester.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Create an applet class that extends Applet and implements ActionListener
public class PersonalInfoApplet extends Applet implements ActionListener {

    // Declare buttons for 'A' and 'B'
    Button buttonA, buttonB;

    // Text area for displaying the information
    TextArea displayArea;

    // Initialize the applet
    public void init() {
        // Set the layout of the applet
        setLayout(new FlowLayout());

        // Create the buttons 'A' and 'B'
        buttonA = new Button("A");
        buttonB = new Button("B");

        // Add ActionListener to both buttons
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);

        // Create a text area to display the information
        displayArea = new TextArea("", 5, 40);
        displayArea.setEditable(false); // Make the text area non-editable

        // Add the buttons and text area to the applet
        add(buttonA);
        add(buttonB);
        add(displayArea);
    }

    // This method handles the action event when either button is pressed
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == buttonA) {
            // Display personal information when button 'A' is pressed
            displayArea.setText("Name: John Doe\nCourse: Computer Science\nRoll No: 12345\nCollege: XYZ University");
        } else if (ae.getSource() == buttonB) {
            // Display CGPA when button 'B' is pressed
            displayArea.setText("CGPA in previous semester: 8.5");
        }
    }
}
