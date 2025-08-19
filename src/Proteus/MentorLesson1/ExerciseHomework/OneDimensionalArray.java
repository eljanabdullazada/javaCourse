package Proteus.MentorLesson1.ExerciseHomework;

import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the array!");
        int arrayLength = scanner.nextInt();
        System.out.println(arrayLength);
        int [] array = new int[arrayLength];

        System.out.println("Enter " + arrayLength + " numbers one by one.");
        for(int i = 0; i < arrayLength; i++){
            System.out.println("Please enter number " + (i + 1) + " in the array.");
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < arrayLength; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for(int i = arrayLength - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int sumOfOddNumbers = 0;
        for(int i = 0; i < arrayLength; i++){
            if(array[i] % 2 == 1){
                sumOfOddNumbers += array[i];
            }
        }

        if(sumOfOddNumbers == 0){
            System.out.println("There are no odd numbers in the array.");
        }
        System.out.println("The sum of all the odd numbers in the array is " + sumOfOddNumbers + ".");

    }
}
