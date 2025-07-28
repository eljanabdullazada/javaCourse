package lesson1;
import java.util.Scanner;

public class ShoppingCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Could you please provide price of the first product?");
        int firstProductPrice = scanner.nextInt();
        System.out.println("Could you please provide price of the second product?");
        int secondProductPrice = scanner.nextInt();
        System.out.println("Could you please provide price of the third product?");
        int thirdProductPrice = scanner.nextInt();

        int totalPrice = firstProductPrice + secondProductPrice + thirdProductPrice;
        System.out.println("The total price is " + totalPrice);

        int averagePrice = totalPrice / 3;
        System.out.println("The average price is " + averagePrice);

        int productOfAllPrices = firstProductPrice * secondProductPrice * thirdProductPrice;
        System.out.println("Product of all prices: " + productOfAllPrices);
    }
}
