package Proteus.MentorLesson12_1.CounterRace;

public class DecreasingCounter implements Runnable{
    @Override
    public void run(){
        for(int i = 10; i >= 0; i--){
            System.out.println("DecreasingCounter: " + i);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println("System crushed: " + e.getMessage());
            }
        }
    }
}
