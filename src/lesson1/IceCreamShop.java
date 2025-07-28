package lesson1;
import java.util.Scanner;
public class IceCreamShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Could you please provide the price of the one scoop of ice-cream?");
        double firstScoop = scanner.nextDouble();
        System.out.println("Could you please provide the price of another scoop of ice-cream?");
        double secondScoop = scanner.nextDouble();

        double totalPrice = firstScoop + secondScoop;
        System.out.println("Total price is " + totalPrice);

        double productOfPrices = firstScoop * secondScoop;
        System.out.println("Product of price is " + productOfPrices);

        double remainedPrice = firstScoop % secondScoop;
        System.out.println("Remained price is " + remainedPrice);
    }
}
