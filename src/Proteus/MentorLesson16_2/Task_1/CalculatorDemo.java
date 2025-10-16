package Proteus.MentorLesson16_2.Task_1;

public class CalculatorDemo {
    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) -> {
            if(b == 0){
                throw new ArithmeticException("Division by 0 is not possible!");
            }
            return a / b;
        };

        System.out.println(add.operate(3, 4));
        System.out.println(sub.operate(3, 4));
        System.out.println(mul.operate(3, 4));
        System.out.println(div.operate(4, 3));

    }
}
