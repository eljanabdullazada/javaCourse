package Proteus.MentorLesson3;

import java.util.Scanner;
public class IntegerToEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer.");
        try{
            double number = Double.parseDouble(scanner.nextLine());
            if(number % 2 == 0) System.out.println("Even.");
            else if(number % 2 == 1) System.out.println("Odd.");
            else{
                throw new NumberFormatException("Input number must be an integer.");
            }
        } catch (NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
