package lesson4;

public class JavaArrays {
    public static void main(String[] args) {
        int[] nums = {1, 23, 44, 4};
        String names[];
        int [][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int []num1: matrix){
            for(int num2: num1){
                System.out.print(num2 + " ");
            }
            System.out.println(" ");
        }
    }
}
