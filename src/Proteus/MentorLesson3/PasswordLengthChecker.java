package Proteus.MentorLesson3;

import java.util.Scanner;

public class PasswordLengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password.");
        String password = scanner.nextLine();

        try{
            if(password.length() < 6){
                throw new InvalidPasswordException("The password must not be less than 6 characters.");
            }
            System.out.println("Password is correct.");
        } catch(RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
