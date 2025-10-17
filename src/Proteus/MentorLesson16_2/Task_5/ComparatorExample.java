package Proteus.MentorLesson16_2.Task_5;

import java.util.*;
import java.util.function.Predicate;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " (" + score + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Leyla", 60),
                new Student("Ali", 45),
                new Student("Zaur", 55),
                new Student("Emin", 70)
        );

        Predicate<Student> highScore = s -> s.score > 50;
        Predicate<Student> longName = s -> s.name.length() > 2;

        students.forEach(s -> {
            if (highScore.and(longName).test(s)) {
                System.out.println("Passed: " + s);
            }
        });
    }
}
