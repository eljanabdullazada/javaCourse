package Proteus.Leetcode;

import java.util.*;

public class GroupAnagrams49 {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs){

        Map<String, List<String>> myMap = new HashMap<>();
        for (String word: strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            myMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(myMap.values());
    }

}
