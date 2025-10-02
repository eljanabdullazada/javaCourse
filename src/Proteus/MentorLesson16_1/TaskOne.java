package Proteus.MentorLesson16_1;

import java.util.function.Predicate;

public class TaskOne {
    public static void main(String[] args) {
        Predicate<Integer> myPredicate = n -> n > 50 && n < 200;
        System.out.println(myPredicate.test(12));
        System.out.println(myPredicate.test(63));

    }
}
