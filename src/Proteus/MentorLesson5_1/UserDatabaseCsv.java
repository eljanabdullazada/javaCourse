package Proteus.MentorLesson5_1;

import java.io.*;
import java.util.Scanner;

public class UserDatabaseCsv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("src/Proteus/MentorLesson5_1/users.csv");

        try{
            if(file.createNewFile()){
                System.out.println("File created successfully.");
            } else{
                System.out.println("File already exist.");
            }

            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
                while(true){
                    System.out.println("Enter name (or 'exit' to quit): ");
                    String name = scanner.nextLine();
                    if(name.equalsIgnoreCase("exit")) break;

                    System.out.println("Enter surname:");
                    String surname = scanner.nextLine();

                    System.out.println("Enter age");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    writer.write(name + "," + surname + "," + age);
                    writer.newLine();
                }
                System.out.println("CSV file written to: " + file.getAbsolutePath());
            }


        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("src/Proteus/MentorLesson5_1/users.csv"))){
            String line;
            System.out.println("---Users---");
            while((line = reader.readLine()) != null){
                String [] users = line.split(",");

                if(users.length == 3){
                    String name = users[0];
                    String surname = users[1];
                    int age = Integer.parseInt(users[2]);
                    System.out.println("Name: " + name + ", Surname: " + surname + ", age: " + age);
                } else {
                    System.out.println("Invalid line.");
                }
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
