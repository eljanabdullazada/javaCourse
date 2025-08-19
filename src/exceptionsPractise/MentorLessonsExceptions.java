package exceptionsPractise;
import java.util.Scanner;

import exceptionsPractise.CustomException;

public class MentorLessonsExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");

        String age = scanner.nextLine();

        // this is avaiting for an interger that is in string format
        int ageStr = Integer.parseInt(age);
        System.out.println(ageStr);

    }
}
