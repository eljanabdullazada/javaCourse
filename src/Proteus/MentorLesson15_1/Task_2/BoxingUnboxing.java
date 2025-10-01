package Proteus.MentorLesson15_1.Task_2;

public class BoxingUnboxing {
    public static void main(String[] args) {
        int primitiveNumber = 50;
        System.out.println("Primitive number: " + primitiveNumber);

        Integer boxedNumber = primitiveNumber;
        System.out.println("After autoboxing (Integer object): " + boxedNumber);

        int unboxedNumber = boxedNumber;
        System.out.println("After autounboxing (primitive int): " + unboxedNumber);
    }
}
