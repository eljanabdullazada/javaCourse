package Proteus.MentorLesson12_1.CounterRace;

public class CounterRaceMain {
    public static void main(String[] args) {

        //this (t1 and t2) works with a separate runnable class
        Thread t1 = new Thread(new IncreasingCounter());
        Thread t2 = new Thread(new DecreasingCounter());

        t1.start();
        t2.start();


        //this (t3 and t4) works with lambda expressions
        Thread t3 = new Thread( () -> {
            for(int i = 0; i <= 10; i++){
                System.out.println("Lambda increasing: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println("System crushed when increasing with lambda: " + e.getMessage());
                }
            }
        }
        );

        Thread t4 = new Thread ( () -> {
            for(int i = 10; i >= 0; i--){
                System.out.println("Lambda decreasing: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println("System crushed when decreasing with lambda: " + e.getMessage());
                }
            }
        }
        );


    }
}
