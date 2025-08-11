package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nece element olacaq?");
        int arrayLenth = scanner.nextInt();
        //part 1
        int [] arr = new int[arrayLenth];
        int index = 0;

        System.out.println("Array elemenlerini daxil edin");
        // part 2
        while(scanner.hasNext()){
            arr[index] = scanner.nextInt();
            index++;
            if(index == arr.length){
                break;
            }
        }

        // part 3
        for(int i = 0; i<arr.length; i++){
            System.out.println("Element " + (i + 1) + ": "+ arr[i]);
        }

        // part 4
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Array elementlerinin cemi: " + sum);


        //part 5
        int min = arr[0];
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Minimum element in array: " + min);
        System.out.println("Maximum element in array: " + max);

        System.out.println();
        //Stream version for sum, min, max, and average
        System.out.println("Array elementlerinin ededi ortasi: " + Arrays.stream(arr).average());
        System.out.println("Array elementlerinin minimumu: " + Arrays.stream(arr).min());
        System.out.println("Array elementlerinin maximumu: " + Arrays.stream(arr).max());
        System.out.println("Array elementlerinin cemi: " + Arrays.stream(arr).sum());

    }
}
