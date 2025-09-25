package Proteus.MentorLesson14_1.StringBuilderMethods;

public class DeletionOfWordsFromSentence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("String builder is useful!!!");

        sb.delete(0, 5);
        sb.delete(sb.length() - 3, sb.length());

        System.out.println(sb);

    }
}
