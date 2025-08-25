package Proteus.MentorLesson5;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class CreateFileAndFolder {
    public static void main(String[] args) {
        String pathToFolders = "/Users/elcan/Desktop/";
        File logsDirectory = new File(pathToFolders, "Logs");
        System.out.println(logsDirectory);

        if(!logsDirectory.exists()){
            logsDirectory.mkdir();
            System.out.println("Directory created: " + logsDirectory.getAbsolutePath());
        } else{
            System.out.println("Directory already exists: " + logsDirectory.getAbsolutePath());
        }

        File logFile = new File(logsDirectory, LocalDate.now() + ".txt");

        if(!logFile.exists()){
            try{
                logFile.createNewFile();
                System.out.println("File successfully created: " + logFile.getAbsolutePath());
            } catch(IOException e){
                System.out.println("Error creating file: " + e.getMessage());
            }
        }

        System.out.println("Information about the file:");
        System.out.println("Faylın tam yolu: " + logFile.getAbsolutePath());
        System.out.println("Faylın adı: " + logFile.getName());
        System.out.println("Faylın ölçüsü (baytla): " + logFile.length());

    }
}
