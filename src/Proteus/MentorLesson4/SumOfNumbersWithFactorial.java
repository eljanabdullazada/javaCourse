package Proteus.MentorLesson4;
import java.util.Scanner;

public class SumOfNumbersWithFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Sum of all " + number + " numbers is " + findSum(number));
    }

    public static int findSum(int number){
        if(number == 0) return 0;
        if(number == 1) return 1;

        return number + findSum(number - 1);
    }
}
