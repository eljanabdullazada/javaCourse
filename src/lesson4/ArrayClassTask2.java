package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows in array");
        int rows = scanner.nextInt();
        System.out.println("Please enter the number of columns in array");
        int columns = scanner.nextInt();

        int [][] threeDimentionalArray = new int[rows][columns];
        System.out.println("Please enter the elements in array");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Please enter array element for [" + i + "][" + j + "]");
                threeDimentionalArray[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Here is the 2 dimensional array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(threeDimentionalArray[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += threeDimentionalArray[i][j];
            }
        }

        // sum of the two-dimensional array
        System.out.println("Sum of the elements in two-dimensional array: " + sum);
    }
}
