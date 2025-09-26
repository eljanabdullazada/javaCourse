package Proteus.MentorLesson14_1.StringBuilderMethods;

public class PalindromeCheckOnMultipleWords {
    public static void main(String[] args) {
        String[] words = {"Level", "Java", "Anna", "Palindrome", "civic"};

        for (String word: words){
            StringBuilder sb = new StringBuilder(word);
            System.out.println(word + " -> " + word.equalsIgnoreCase(sb.reverse().toString()));
        }
    }
}
