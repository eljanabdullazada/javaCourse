package lesson4;

public class ArrayClassTask3 {
    public static void main(String[] args) {

        int [][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // print a row in matrix
        for(int i = 0; i < matrix[1].length; i++){
            System.out.print(matrix[1][i] + " ");
        }

        System.out.println();

        // print a column in matrix
        for(int i = 0; i < matrix.length; i++){
            System.out.println(matrix[i][2] + " ");
        }

    }
}
