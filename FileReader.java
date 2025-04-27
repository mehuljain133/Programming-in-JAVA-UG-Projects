//Write a program to read a file and display only those lines that have the first two characters as '//' (Use try with resources).

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        // Check if command-line argument for file path is provided
        if (args.length != 1) {
            System.out.println("Usage: java FileReaderExample <filePath>");
            return;
        }

        String filePath = args[0];

        // Try-with-resources to automatically close resources
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line and check if it starts with "//"
            while ((line = br.readLine()) != null) {
                if (line.startsWith("//")) {
                    System.out.println(line);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }
    }
}
