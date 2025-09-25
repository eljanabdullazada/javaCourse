package Proteus.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidAnagram242 {
    public static void main(String[] args) {

        // Example 1
        String s1 = "anagram", t1 = "nagaram";

        // Example 2
        String s2 = "rat", t2 = "car";

        System.out.println(isAnagram(s1, t1));
        System.out.println(isAnagram(s2, t2));

    }

    public static boolean isAnagram(String s, String t) {
        char [] firstWord = s.toCharArray();
        char [] secondWord = t.toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        if(Arrays.equals(firstWord, secondWord)){
            return true;
        }

        return false;
    }
}
