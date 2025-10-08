package Proteus.Leetcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));

    }

    public static int[] topKFrequent(int[] nums, int k){
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

        Set<Integer> noDuplicateList = new LinkedHashSet<>();
        for (int n: nums){
            noDuplicateList.add(n);
        }

        Object[] myKeys = noDuplicateList.toArray();

        int[] countArray = new int[indexToCountMap.size()];

        for(int i = 0; i < indexToCountMap.size(); i++){
            countArray[i] = indexToCountMap.get(myKeys[i]);
        }

//        for (int i = 0; i < countArray.length; i++) {
//            System.out.println(countArray[i]);
//        }

        int[] result = new int[k];
        int resultArrayIndex = 0;
        int max = countArray[0];
        for (int i = 0; i < countArray.length; i++) {
            if(countArray[i] >= max){
                max = countArray[i];
                result[resultArrayIndex] = (int)myKeys[i];
                resultArrayIndex++;
            }
        }

//        for(int n: result){
//            System.out.println(n);
//        }
        return result;
    }
}
