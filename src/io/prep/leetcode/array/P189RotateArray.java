package io.prep.leetcode.array;

import java.util.Arrays;

public class P189RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7};
        
        for(int num : nums) {
            System.out.print(" " + num);
        }
        
        new P189RotateArray().rotate(nums, 3);
        
        System.out.println();
        for(int num : nums) {
            System.out.print(" " + num);
        }
    }

    public int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        
        int[] second = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int[] first = Arrays.copyOf(nums, nums.length - k);
        
        System.arraycopy(second, 0, nums, 0, second.length);
        System.arraycopy(first, 0, nums, second.length, first.length);
        
        return nums;
    }
}
