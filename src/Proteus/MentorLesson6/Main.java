package Proteus.MentorLesson6;

public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringBox = new MagicBox<>();
        stringBox.store("Hello World!");
        System.out.println(stringBox.retreive());

        MagicBox<Integer> intBox = new MagicBox<>();
        intBox.store(1);
        System.out.println(intBox.retreive());

        MagicBox<Double> doubleBox = new MagicBox<>();
        doubleBox.store(12.5);
        System.out.println(doubleBox.retreive());

        MagicBox<Boolean> booleanBox = new MagicBox<>();
        booleanBox.store(true);
        System.out.println(booleanBox.retreive());
    }
}
