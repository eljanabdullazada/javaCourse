package lesson2;

import java.util.Scanner;
public class AgeVerificationSpaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age for verification: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("You are not verified, you are under the age 18");
        }
        else{
            System.out.println("You are verified");
        }
    }
}
