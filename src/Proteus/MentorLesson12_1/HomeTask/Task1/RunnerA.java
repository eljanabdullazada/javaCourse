package Proteus.MentorLesson12_1.HomeTask.Task1;

public class RunnerA implements Runnable{

    @Override
    public void run() {
        System.out.println("A started the race.");
        try{
            Thread.sleep((int)(Math.random() * 5));
        } catch(InterruptedException e){
            System.out.println("Runner A: " + e.getMessage());
        }

        System.out.println("A finished the race.");
    }
}
