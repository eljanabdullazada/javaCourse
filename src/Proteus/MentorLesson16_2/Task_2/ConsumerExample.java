package Proteus.MentorLesson16_2.Task_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Salam", "Lambda" ,"Java");

        Consumer<String> printWordLength = word -> {
            System.out.println(word + " -> " + word.length());
        };

        words.forEach(printWordLength);
    }
}
