package lesson2;

import java.util.Scanner;

public class AlienJuiceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of banana juice (ml): ");
        int bananaJuice = scanner.nextInt();

        System.out.print("Enter amount of cactus juice (ml): ");
        int cactusJuice = scanner.nextInt();

        int totalJuice = bananaJuice + cactusJuice;
        int fullGlasses = totalJuice / 250;

        System.out.println("\n🗨️ \"Whoa! That makes " + totalJuice + " ml of cosmic juice! " +
                "Enough to fill " + fullGlasses + " full glasses!\"");

        scanner.close();
    }
}

