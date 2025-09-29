package Proteus.MentorLesson15_1.Task_1;

public class Main {
    public static void main(String[] args) {
        Month currentMonth = Month.JULY;
        switch(currentMonth){
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("This belongs to summer months.");
                break;
            default:
                System.out.println("This does not belong to summer months.");

        }
    }
}
