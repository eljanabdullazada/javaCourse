package Proteus.MentorLesson6;

public class NumberTool <T extends Number>{
    private T item;

    public double cube(T value){
        return Math.pow(value.doubleValue(), 3);
    }

}
