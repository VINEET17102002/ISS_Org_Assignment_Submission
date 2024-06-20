package com.example.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteExample {

    private static final String FILE_PATH = "data.txt";

    public static void main(String[] args) {
        // Create file and write data
        createFileAndWriteData();

        // Read data from file
        readDataFromFile();

        // Update data in file
        updateDataInFile();

        // Read updated data from file
        readDataFromFile();

        // Delete data from file
        deleteFile();
    }

    // Method to create a new file and write data to it
    public static void createFileAndWriteData() {
        try {
            FileWriter writer = new FileWriter(FILE_PATH);
            writer.write("Hello, World!\n");
            writer.write("This is a test file.\n");
            writer.close();
            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read data from the file
    public static void readDataFromFile() {
        try {
            File file = new File(FILE_PATH);
            Scanner scanner = new Scanner(file);
            System.out.println("Reading data from file:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to update data in the file
    public static void updateDataInFile() {
        try {
            FileWriter writer = new FileWriter(FILE_PATH, true); // true for append mode
            writer.write("Additional line added for update.\n");
            writer.close();
            System.out.println("Data updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to delete the file
    public static void deleteFile() {
        File file = new File(FILE_PATH);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
