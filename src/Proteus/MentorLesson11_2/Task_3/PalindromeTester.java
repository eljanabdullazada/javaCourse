package Proteus.MentorLesson11_2.Task_3;

import java.util.Scanner;
public class PalindromeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);

        if(input.contentEquals(sb.reverse())){
            System.out.println("It is a Palindrome.");
        } else{
            System.out.println("It is not a Palindrome.");
        }

    }
}
