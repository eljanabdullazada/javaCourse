package Proteus.MentorLesson16_1;

import java.util.function.Function;

public class TaskTwo {
    public static void main(String[] args) {
        Function<Double, String> convertToAzn = price -> price + " AZN";
        System.out.println(convertToAzn.apply(89.99));
    }
}
