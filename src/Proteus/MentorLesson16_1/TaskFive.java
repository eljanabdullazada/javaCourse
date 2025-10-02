package Proteus.MentorLesson16_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TaskFive {
    public static void main(String[] args) {

        List<String> names = List.of("Ayan", "Samir", "Leyla", "Nigar", "Tural");
        System.out.println("Long name + ending with a " + filter(names, name -> name.length() > 4 && name.endsWith("a")));

    }

    public static List<String> filter(List<String> list, Predicate<String> condition) {
        List<String> result = new ArrayList<>();
        for (String item : list) {
            if (condition.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
