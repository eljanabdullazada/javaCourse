package Proteus.MentorLesson14_1.StringBuilderMethods;

import java.util.Arrays;

public class FindTheLongestWord {
    public static void main(String[] args) {
        String sentence = "It is very interesting to learn StringBuilder with Java.";
        String[] array = sentence.split(" ");
        System.out.println(Arrays.toString(array));
        StringBuilder sb = new StringBuilder();
        for(var word : array){
            if(word.length() > sb.length()){
                sb.setLength(0);
                sb.append(word);
            }
        }
        System.out.println(sb);

//        String []array = sentence.split(" ");
//        System.out.println(Arrays.toString(array));
//        String longestWord = array[0];
//
//        for (int i = 1; i <= array.length - 1; i++){
//            if(longestWord.length() < array[i].length()){
//                longestWord = array[i];
//            }
//        }
//        System.out.println(longestWord);

    }
}
