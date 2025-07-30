package lesson1.notes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //    Primitive data types in java are:

//    byte, short, int, long float, double, char, and boolean.

//    String is non-primitive data type which is actually an object.

//    Examples for those data types are following:

        byte thisIsByte = 127;

        double thisIsDouble = 127.7;

        //should be denoted with f to make sure it is a floating point number.
        float thisIsFloat = 127.7f;

        //    boolean can hold true or false.
        boolean value = true;

        //    holds only a character
        char thisIsChar = 'a';

        //    holds a set of characters
        String thisIsString = "Hello World";


// operators in java are arithmetic, relational, logical, assignment, increment/decrement, and comparison operators

 /*   Math class allows us to use mathematical functions
       it includes
       Math.abs(x)
       Math.max(a, b)
       Math.min(a, b)
       Math.sqrt(x)
       Math.pow(a, b)
       Math.round(x)
       Math.ceil(x)
       Math.floor(x)
       Math.random()
  */

//    Scanner class is used to take input from user for instance:
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

//    switch is kinda a form of multi choice if else statement using cases and break statement;

        switch(inputNumber){
            case 1:
                System.out.println(thisIsByte);
                break;
            case 2:
                System.out.println(thisIsDouble);
                break;
            case 3:
                System.out.println(thisIsFloat);
                break;
            default:
                System.out.println("Default message is written");
        }
    }

}
