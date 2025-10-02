package Proteus.MentorLesson16_1;

public class Main {
    public static void main(String[] args) {
        Calculation subtractor = (x, y) -> x - y;
        System.out.println(subtractor.operation(4, 3));
        Calculation multiplayer = (x, y) -> x * y;
        System.out.println(multiplayer.operation(10, 15));

    }
}
