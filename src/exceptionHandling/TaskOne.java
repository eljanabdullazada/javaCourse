package exceptionHandling;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try{
            if(input.length() < 6 ){
                throw new InvalidPasswordException("The length of password should not be less than 6 characters");
            }


        } catch (InvalidPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}
