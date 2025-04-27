// Write a program that creates a Banner and then creates a thread to scrolls the message in the banner from left to right across the applet’s window.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Create an applet class that extends Applet
public class ScrollingBannerApplet extends Applet implements Runnable {

    // Message to be displayed in the banner
    String message = "Welcome to the Scrolling Banner!";
    // X position of the message
    int xPosition = 300;
    // Y position for the message (fixed)
    int yPosition = 100;

    // Thread for scrolling the message
    Thread scrollThread;

    // Initialize the applet
    public void init() {
        // Set the applet layout
        setLayout(null);

        // Set the size of the applet window
        setSize(600, 200);

        // Start the scrolling thread
        scrollThread = new Thread(this);
        scrollThread.start();
    }

    // The paint method to display the message
    public void paint(Graphics g) {
        // Set the font color for the banner text
        g.setColor(Color.BLUE);

        // Display the message at the current x-position
        g.drawString(message, xPosition, yPosition);
    }

    // The run method that handles the scrolling logic
    public void run() {
        while (true) {
            // Move the text from right to left across the applet window
            xPosition -= 2; // Scroll speed

            // If the message has completely scrolled off the window, reset its position
            if (xPosition < -getFontMetrics(getFont()).stringWidth(message)) {
                xPosition = getWidth();
            }

            // Repaint the applet to update the position of the message
            repaint();

            // Sleep to control the speed of scrolling
            try {
                Thread.sleep(50); // Adjust the speed by changing the sleep duration
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }

    // Stop the thread when the applet is destroyed or stopped
    public void stop() {
        scrollThread.interrupt();
    }

    // Handle window closing and other events
    public void destroy() {
        stop();
    }
}
