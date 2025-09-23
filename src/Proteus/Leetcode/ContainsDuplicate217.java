package Proteus.Leetcode;

import java.util.HashSet;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet mySet = new HashSet();
        for(int i = 0; i < nums.length; i++){
            if(mySet.contains(nums[i])){
                return true;
            }
            mySet.add(nums[i]);
        }

        return false;
    }
}
