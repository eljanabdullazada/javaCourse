package Proteus.MentorLesson12_1.CharacterPrinter;

public class CharPrinter implements Runnable{
    char CharToPrint;
    int repeatCount;

    public CharPrinter(char CharToPrint, int repeatCount){
        this.CharToPrint = CharToPrint;
        this.repeatCount = repeatCount;
    }

    @Override
    public void run() {
        for(int i = 0; i < repeatCount; i++){
            System.out.print(CharToPrint);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("System crushed: " + e.getMessage());
            }
        }
    }
}
