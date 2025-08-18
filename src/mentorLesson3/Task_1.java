package mentorLesson3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("1 ci ededi daxil edin");
            int number1 = Integer.parseInt(sc.nextLine());
            System.out.println("2 ci ededi daxil edin");
            int number2 = Integer.parseInt(sc.nextLine());

        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
}
