package Proteus.MentorLesson12_1.HomeTask.Task1;

public class RunnerA implements Runnable{

    private long finishTimeA;

    public long getFinishTime() {
        return finishTimeA;
    }

    @Override
    public void run() {
        System.out.println("A started the race.");
        try{
            finishTimeA = (int)(Math.random() * 5);
            Thread.sleep((long)finishTimeA);
        } catch(InterruptedException e){
            System.out.println("Runner A: " + e.getMessage());
        }

        System.out.println("A finished the race.");
    }
}
