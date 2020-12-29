package com.gdrt.arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int previousElement = nums[0];
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != previousElement) {
                index++;
                nums[index] = nums[i];
            }
            previousElement = nums[i];
        }
        return ++index;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4,8,8,11,15};
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        int res = r.removeDuplicates(nums);
        System.out.println(res);
        for (int i = 0; i < res; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
