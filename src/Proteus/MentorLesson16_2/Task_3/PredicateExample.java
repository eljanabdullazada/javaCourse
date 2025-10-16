package Proteus.MentorLesson16_2.Task_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Salam", "Programmer");

        Predicate<String> checkLength = word -> word.length() > 5;

        for(String word: words){
            System.out.println(word + " length -> " + checkLength.test(word));
        }
    }
}
