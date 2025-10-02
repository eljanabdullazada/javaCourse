package Proteus.MentorLesson16_1;

public class Task0 {
    public static void main(String[] args) {
        String word = "limit";
        Tasks taskOne = () -> new StringBuilder(word).reverse().toString();
        System.out.println(taskOne.reversed());
    }
}

@FunctionalInterface
interface Tasks{
    String reversed();

}
