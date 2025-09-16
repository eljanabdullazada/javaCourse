package Proteus.MentorLesson_11_2.Task_1;

public class SystemManager {
    public static void main(String[] args) throws InterruptedException{
        try(
        FileHandler f1 = new FileHandler("data1.txt");
        FileHandler f2 = new FileHandler("data2.txt");
        FileHandler f3 = new FileHandler("data3.txt")) {
        }
        System.gc();

        Thread.sleep(10000);

        System.out.println("Main program finished.");

    }
}
