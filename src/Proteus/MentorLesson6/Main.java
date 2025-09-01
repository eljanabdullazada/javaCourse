package Proteus.MentorLesson6;

import jdk.jshell.JShell;

public class Main {
    public static void main(String[] args) {

//        Below commented section is for testing of the classes other than TaskFourOptional.java
//        MagicBox<String> stringBox = new MagicBox<>();
//        stringBox.store("Hello World!");
//        System.out.println(stringBox.retrieve());
//
//        MagicBox<Integer> intBox = new MagicBox<>();
//        intBox.store(1);
//        System.out.println(intBox.retrieve());
//
//        MagicBox<Double> doubleBox = new MagicBox<>();
//        doubleBox.store(12.5);
//        System.out.println(doubleBox.retrieve());
//
//        MagicBox<Boolean> booleanBox = new MagicBox<>();
//        booleanBox.store(true);
//        System.out.println(booleanBox.retrieve());
//
//
//        NumberTool<Integer> intTool = new NumberTool<>();
//        NumberTool<Double> doubleTool = new NumberTool<Double>();
//
//        System.out.println(intTool.cube(3));
//        System.out.println(doubleTool.cube(3.3));


        TaskFourOptional<String> stringList = new TaskFourOptional<>();
        stringList.addToList("Hello");
        stringList.addToList("How are you?");

        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));
        System.out.println(stringList.getAll());
        System.out.println();
        stringList.removeFromList("Hello");
        System.out.println(stringList.getAll());
        System.out.println();

        TaskFourOptional<Double> doubleList = new TaskFourOptional<>();

        doubleList.addToList(12.5);
        doubleList.addToList(3456789.9);

        System.out.println(doubleList.get(0));
        System.out.println(doubleList.get(1));
        System.out.println(doubleList.getAll());
        System.out.println();
        doubleList.removeFromList(3456789.9);
        System.out.println(doubleList.getAll());
        System.out.println();



    }
}
