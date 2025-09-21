package Proteus.MentorLesson12_1.HomeTask.Task1;

import com.sun.security.jgss.GSSUtil;

public class RaceMain {
    public static void main(String[] args) {

        RunnerA runnerA = new RunnerA();
        RunnerB runnerB = new RunnerB();

        Thread t1 = new Thread(runnerA);
        Thread t2 = new Thread(runnerB);

        System.out.println("State of runner A: " + t1.getState());
        System.out.println("State of runner B: " + t2.getState());

        t1.start();
        t2.start();

        System.out.println("State A after start: " + t1.getState());
        System.out.println("State B after start: " + t2.getState());


        System.out.println("State A after finish: " + t1.getState());
        System.out.println("State B after finish: " + t2.getState());

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            System.out.println("Error during join: " + e.getMessage());
        }

        if(runnerA.getFinishTime() < runnerB.getFinishTime()){
            System.out.println("Runner A won.");
        }else if(runnerA.getFinishTime() == runnerB.getFinishTime()){
            System.out.println("It is a tie.");
        } else{
            System.out.println("Runner B won.");
        }
    }
}
