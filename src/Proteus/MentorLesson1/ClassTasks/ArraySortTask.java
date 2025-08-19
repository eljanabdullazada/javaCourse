package Proteus.MentorLesson1.ClassTasks;

import java.util.Arrays;

public class ArraySortTask {
    public static void main(String[] args) {
        int[][] numbers = {
                {15, 8, 22},
                {5, 31, 10},
                {40, 1, 18}
        };

        for(int i = 0; i < numbers.length; i++){
            Arrays.sort(numbers[i]);
        }

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.printf("%d\t", numbers[i][j]);
            }
            System.out.println();
        }

    }
}
