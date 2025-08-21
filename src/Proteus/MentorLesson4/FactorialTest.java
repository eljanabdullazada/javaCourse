package Proteus.MentorLesson4;
import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + " is " + findFactorial(number));
    }

    public static int findFactorial(int number){
        if(number == 0) return 1;
        if(number == 1) return 1;

        return number * findFactorial(number - 1);
    }
}
