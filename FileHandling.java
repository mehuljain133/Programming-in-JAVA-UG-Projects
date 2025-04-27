// File Handling Byte Stream, Character Stream, File I/O Basics, File Operations 

import java.io.*;

// Main class to demonstrate file handling
public class FileHandlingExample {

    public static void main(String[] args) {

        // File path for demonstration
        String filePath = "example.txt";
        String byteFilePath = "example_byte.txt";

        // Byte Stream Example: Writing and Reading a Byte File
        try (FileOutputStream byteOutput = new FileOutputStream(byteFilePath)) {
            String byteData = "This is a byte stream file handling example.\n";
            byteData = byteData + "It handles raw binary data (e.g., image, audio, etc.).";

            byteOutput.write(byteData.getBytes());  // Writing byte data to file
            System.out.println("Byte Stream: Data written to " + byteFilePath);
        } catch (IOException e) {
            System.out.println("Error in Byte Stream handling: " + e.getMessage());
        }

        try (FileInputStream byteInput = new FileInputStream(byteFilePath)) {
            int byteRead;
            System.out.println("\nByte Stream: Reading data from byte file:");
            while ((byteRead = byteInput.read()) != -1) {
                System.out.print((char) byteRead);  // Reading byte data and converting to characters
            }
        } catch (IOException e) {
            System.out.println("Error in Byte Stream reading: " + e.getMessage());
        }

        // Character Stream Example: Writing and Reading a Character File
        try (FileWriter charOutput = new FileWriter(filePath)) {
            String charData = "This is a character stream file handling example.\n";
            charData += "It handles text data in a character-wise manner.";
            charOutput.write(charData);  // Writing character data to file
            System.out.println("\nCharacter Stream: Data written to " + filePath);
        } catch (IOException e) {
            System.out.println("Error in Character Stream handling: " + e.getMessage());
        }

        try (FileReader charInput = new FileReader(filePath)) {
            int charRead;
            System.out.println("\nCharacter Stream: Reading data from character file:");
            while ((charRead = charInput.read()) != -1) {
                System.out.print((char) charRead);  // Reading character data
            }
        } catch (IOException e) {
            System.out.println("Error in Character Stream reading: " + e.getMessage());
        }

        // File Operations Example: Check file existence, create directories
        File file = new File(filePath);

        // Checking if file exists
        if (file.exists()) {
            System.out.println("\nFile exists: " + filePath);
        } else {
            System.out.println("\nFile does not exist, creating it.");
            try {
                file.createNewFile();  // Create a new file if it doesn't exist
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }

        // Creating a new directory
        File directory = new File("example_directory");
        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Directory created: example_directory");
            } else {
                System.out.println("Failed to create directory.");
            }
        }

        // Checking file and directory details
        if (file.exists()) {
            System.out.println("\nFile details:");
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Is file: " + file.isFile());
            System.out.println("File size: " + file.length() + " bytes");
        }

        // Deleting the example file and directory after use
        if (file.exists() && file.delete()) {
            System.out.println("\nFile deleted: " + filePath);
        }

        if (directory.exists() && directory.delete()) {
            System.out.println("Directory deleted: example_directory");
        }
    }
}
