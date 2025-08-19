package Proteus.MentorLesson1.ExerciseHomework;

public class MinMax2DArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {15, 8, 22},
                {5, 31, 10},
                {40, 1, 18}
        };

        int min = numbers[0][0];
        int max = numbers[0][0];
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                if(numbers[i][j] < min){
                    min = numbers[i][j];
                }
                if(numbers[i][j] > max){
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("Min element is: " + min
        + "\nMax element is: " + max);
    }
}
