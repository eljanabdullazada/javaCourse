package Proteus.MentorLesson5;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class WriteReadFromFile {
    public static void main(String[] args) {
        String filePath = "output.txt";

        String[] names = {"Orxan", "Aysu", "Senan", "Omer", "Nuhbala", "Ali", "Mahammadali", "Eljan"};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello");
            writer.newLine();
            writer.write("Java Group Proteus!!!");
            writer.newLine();

            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }

            System.out.println("Fayla yazıldı: " + filePath);

        } catch (IOException e) {
            System.out.println("Yazma zamanı xəta baş verdi: " + e.getMessage());
        }

        System.out.println("\nFayldakı məzmun:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Oxuma zamanı xəta baş verdi: " + e.getMessage());
        }
    }
}
