package Proteus.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        int k = 2;

        Arrays.sort(nums);

        int [] indexArray = new int[nums.length];
        int indexOfIndexArray = 0;
        Map<Integer, Integer> indexToCountMap = new LinkedHashMap<>();

        // 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3
        // 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3

        for(int i = 0; i < nums.length;){
            int cnt = 0;
            int current = nums[i];
            for(int j = i; j < nums.length; j++){
                if(nums[j] == current){
                    cnt++;
                } else{
                    break;
                }
            }

            indexToCountMap.put(current, cnt);
            i = i + cnt;
        }

        System.out.println(indexToCountMap);

    }
}
