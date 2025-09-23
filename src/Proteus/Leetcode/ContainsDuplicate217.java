package Proteus.Leetcode;

import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate217 {

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        // using set will allow us to later make the code reusable by adjusting only the initialized part
        // such as using TreeSet or sth else which may sort the numbers or perform other operations.
        Set<Integer> mySet = new HashSet();
        for(int i = 0; i < nums.length; i++){
            if(mySet.contains(nums[i])){
                return true;
            }
            mySet.add(nums[i]);
        }
        return false;
    }
}
