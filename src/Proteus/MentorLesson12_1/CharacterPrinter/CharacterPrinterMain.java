package Proteus.MentorLesson12_1.CharacterPrinter;

public class CharacterPrinterMain {
    public static void main(String[] args) {
        //create different threads for characters (-, *, #)
        Thread t1 = new Thread(new CharPrinter('-', 50));
        Thread t2 = new Thread(new CharPrinter('*', 50));
        Thread t3 = new Thread(new CharPrinter('#', 50));

        t1.start();
        t2.start();
        t3.start();

    }
}
