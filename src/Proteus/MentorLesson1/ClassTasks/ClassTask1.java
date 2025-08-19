package Proteus.MentorLesson1.ClassTasks;

public class ClassTask1 {
    public static void main(String[] args) {
        int[][] numbers = {
                {15, 8, 22},
                {5, 31, 10},
                {40, 1, 18}
        };

        int oddNumberCounter = 0;
        int evenNumberCounter = 0;

        for(int []arr: numbers){
            for(int num: arr){
                if(num % 2 == 0){
                    evenNumberCounter += 1;
                }
                else{
                    oddNumberCounter += 1;
                }
            }
        }

        System.out.println("Number of even numbers: " + evenNumberCounter
        + "\nNumber of odd numbers: " + oddNumberCounter);
    }
}
