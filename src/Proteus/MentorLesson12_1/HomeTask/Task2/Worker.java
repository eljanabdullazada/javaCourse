package Proteus.MentorLesson12_1.HomeTask.Task2;

public class Worker implements Runnable{

    private String name;

    public Worker(String name){
        this.name = name;
    }

    @Override
    public void run(){
        try{
            for(int i = 1; i <= 3; i++){
                System.out.println("Worker " + name + " is preparing shelve number " + i );
                Thread.sleep(1 + (int)(Math.random() * 3) * 1000);
            }
        } catch (InterruptedException e){
            System.out.println("Error while suspending worker: " + name + ". " + e.getMessage());
        }
    }
}
