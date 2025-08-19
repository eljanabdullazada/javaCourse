package Proteus.MentorLesson1.ClassTasks;

import java.util.Scanner;

public class ClassTask5 {
    public static void main(String[] args) {
        String[][] nameContainer = {
                {"Resul", "Seymur", "Huseyn"},
                {"Asim", "Ismayil", "Elcan"},
                {"Teymur", "Natiq", "Senan"}
        };

        Scanner scanner = new Scanner(System.in);
        String nameToSearch = scanner.nextLine();

        for(int i = 0; i < nameContainer.length; i++){
            for(int j = 0; j < nameContainer[i].length; j++){
                if(nameContainer[i][j].equals(nameToSearch)){
                    System.out.println("Found the name in row " + i + " column " + j);
                }
            }
        }
    }
}
