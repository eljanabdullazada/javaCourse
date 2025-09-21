package Proteus.MentorLesson12_1.HomeTask.Task1;

public class RunnerB implements Runnable{
    private long finishTimeB;

    public long getFinishTime() {
        return finishTimeB;
    }

    @Override
    public void run() {
        System.out.println("B started the race.");
        try{
            finishTimeB = (int)(Math.random() * 5);
            Thread.sleep((long)finishTimeB);
        } catch (InterruptedException e) {
            System.out.println("Runner B: " + e.getMessage());
        }
        System.out.println("B finished the race.");
    }
}
