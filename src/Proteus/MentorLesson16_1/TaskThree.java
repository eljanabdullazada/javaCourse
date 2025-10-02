package Proteus.MentorLesson16_1;

import java.util.function.Consumer;

public class TaskThree {
    public static void main(String[] args) {
        Consumer<String> askHow = name -> System.out.println("How are you today " + name + "?");
        askHow.accept("Eljan");
    }
}
