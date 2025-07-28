package lesson1;
import java.util.Scanner;

public class TheCoffeeBudgetCrisis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Could you please tell how many cups of coffee are consumed per day?");
        int cups = scanner.nextInt();

        System.out.println("Could you please also say what is the cost per cup?");
        int costPerCup = scanner.nextInt();

        int totalMonthlyCost = cups * costPerCup * 30;
        System.out.println("Total monthly cost of coffee is: " + totalMonthlyCost);

        int numberOfCupsPerEmployee = cups * 6;
        System.out.println("Number of coffee cups per employee: " + numberOfCupsPerEmployee);
    }
}
