// Write a program that copies content of one file to another. Pass the names of the files through command-line arguments.

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <sourceFile> <destinationFile>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try {
            // Create input and output streams for file reading and writing
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);

            int byteData;
            // Read bytes from source file and write them to destination file
            while ((byteData = fileInputStream.read()) != -1) {
                fileOutputStream.write(byteData);
            }

            // Close the streams
            fileInputStream.close();
            fileOutputStream.close();

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error: One of the files was not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while copying the file.");
        }
    }
}
