package Proteus.MentorLesson1.ClassTasks;

public class ClassTask2 {
    public static void main(String[] args) {
        int[][] numbers = {
                {15, 8, 22},
                {5, 31, 10},
                {40, 1, 18}
        };

        for(int i = 0; i < numbers.length; i++){
            int sumOfRowElements = 0;
            for(int j = 0; j < numbers[i].length; j++){
                sumOfRowElements += numbers[i][j];
            }
            System.out.println("The sum of the elements in row " + i + " is: " + sumOfRowElements);
        }
    }
}
