package Proteus.MentorLesson5_1;

import java.io.*;
import java.util.Scanner;

public class SimpleNotepadApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("src/Proteus/MentorLesson5_1/notes.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("notes.txt already exists.");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
                while (true) {
                    System.out.println("Enter a note.");
                    String text = scanner.nextLine();
                    if (text.equalsIgnoreCase("exit")) {
                        break;
                    }
                    writer.write(text);
                    writer.newLine();
                }

                System.out.println("Notes saved.");
            }

        } catch (IOException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }
}