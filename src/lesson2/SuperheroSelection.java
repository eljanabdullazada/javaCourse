package lesson2;

import java.util.Scanner;

public class SuperheroSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select a number for super hero seleciton: \n" +
                "1. Batman\n" +
                "2. Ironman\n" +
                "3. Spiderman");

        switch(scanner.nextInt()){
            case 1:
                System.out.println("Your selection is Batman");
                break;
            case 2:
                System.out.println("Your selection is Ironman");
                break;
            case 3:
                System.out.println("Your selection is Spiderman");
                break;
            default:{
                System.out.println("Invalid selection");
            }
        }
    }
}
