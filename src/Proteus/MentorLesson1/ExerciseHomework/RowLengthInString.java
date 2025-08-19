package Proteus.MentorLesson1.ExerciseHomework;
public class RowLengthInString{
    public static void main(String[] args) {
        String [] words = {"Java", "programlashdirma", "dili", "arraylar"};
        int sum = 0;
        for(int i = 0; i < words.length; i++){
            System.out.print("\"" + words[i] + "\" " + "(" + words[i].length() + ") ");
            sum += words[i].length();
        }
        System.out.println("Sum of the length of all elements in String is: " + sum);
    }
}