package Proteus.MentorLesson6;

public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringBox = new MagicBox<>();
        stringBox.store("Hello World!");
        System.out.println(stringBox.retrieve());

        MagicBox<Integer> intBox = new MagicBox<>();
        intBox.store(1);
        System.out.println(intBox.retrieve());

        MagicBox<Double> doubleBox = new MagicBox<>();
        doubleBox.store(12.5);
        System.out.println(doubleBox.retrieve());

        MagicBox<Boolean> booleanBox = new MagicBox<>();
        booleanBox.store(true);
        System.out.println(booleanBox.retrieve());


        NumberTool<Integer> intTool = new NumberTool<>();
        NumberTool<Double> doubleTool = new NumberTool<Double>();

        intTool.cube(3);
        doubleTool.cube(3.3);

        System.out.println(intTool.cube(3));
        System.out.println(doubleTool.cube(3.3));


    }
}
