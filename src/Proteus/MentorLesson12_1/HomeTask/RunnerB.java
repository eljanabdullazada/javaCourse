package Proteus.MentorLesson12_1.HomeTask;

public class RunnerB implements Runnable{
    @Override
    public void run() {
        System.out.println("B started the race.");
        try{
            Thread.sleep((int)(Math.random() * 5));
        } catch (InterruptedException e) {
            System.out.println("Runner B: " + e.getMessage());
        }
        System.out.println("B finished the race.");
    }
}
