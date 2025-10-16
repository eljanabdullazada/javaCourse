package Proteus.MentorLesson16_2.Task_4;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<LocalDate> dateSupplier = LocalDate::now;

        System.out.println("The date of today is: " + dateSupplier.get());
    }
}
