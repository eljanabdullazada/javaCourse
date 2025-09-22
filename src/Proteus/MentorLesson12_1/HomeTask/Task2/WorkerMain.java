package Proteus.MentorLesson12_1.HomeTask.Task2;

public class WorkerMain {
    public static void main(String[] args) {
        Worker w1 = new Worker("Leyla");
        Worker w2 = new Worker("Kamal");

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();


        while(t1.isAlive() || t2.isAlive()){
            System.out.println(t1.getName() + " state: " + t1.getState());
            System.out.println(t2.getName() + " state: " + t2.getState());

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Sth happened suspending the thread for 1 second: " + e.getMessage());
            }
        }

        System.out.println("All the shelves are done being prepared.");

    }
}
