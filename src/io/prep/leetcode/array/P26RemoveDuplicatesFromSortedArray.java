package io.prep.leetcode.array;

public class P26RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        
        int[] nums = new int[] {0,0, 1, 1, 1, 1, 2, 3};
        System.out.println(new P26RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        
        return findDuplicate(nums);
    }
    
    private int findDuplicate(int[] nums) {
        int len = nums.length;
        int position = 1;
        for(int i = 1; i < len ; i++) {
            if(nums[position-1] == nums[i]) continue;
            else {nums[position++] = nums[i];}
        }
        
        return position;
    }
}
