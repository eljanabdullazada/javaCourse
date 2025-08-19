package Proteus.MentorLesson1.ExerciseHomework;

import java.util.Scanner;
public class FindCustomerById {
    public static Integer []customerIDs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter customer ID that you would like to find the index of!");
        int customerId = scanner.nextInt();
        System.out.println(findCustomer(customerId));
    }

    public static int findCustomer(int customerId){
        for(int i = 0; i < customerIDs.length; i++){
            if(customerIDs[i].equals(customerId)){
                return i;
            }
        }
        return -1;
    }
}
