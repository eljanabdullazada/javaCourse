package Proteus.Leetcode;

public class BinarySearch704 {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 , 22, 23, 24, 25, 26};
        int target = 7;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int firstIndex = 0;
        int lastIndex = nums.length - 1;

        while (firstIndex <= lastIndex) {
            int mid = firstIndex + (lastIndex - firstIndex) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                firstIndex = mid + 1;
            } else {
                lastIndex = mid - 1;
            }
        }

        return -1;
    }
}
