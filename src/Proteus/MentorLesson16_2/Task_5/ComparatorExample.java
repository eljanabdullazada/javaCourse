package Proteus.MentorLesson16_2.Task_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Leyla", "Ali", "Zaur", "Emin");
        names.sort(Comparator.comparingInt(String::length));
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
    }
}
