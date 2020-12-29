package com.gdrt.arrays;

public class RotateArray {
    // should add an outer loop to handle case when n%k == 0
    public void rotateIncompleteSolution(int[] nums, int k) {

        k = k % nums.length;

        int temp = nums[0];
        int newFirst = nums[nums.length - k];
        int iPrev = 0;
        int iNext;
        for (int i = 0; i < nums.length; i++) {

            iNext = (iPrev + k) % nums.length;
            int newTemp = nums[iNext];
            nums[iNext] = temp;
            temp = newTemp;
            iPrev = iNext;
        }
        nums[0] = newFirst;
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int begin, int end) {
        int temp;
        int j = 0;
        for (int i = begin; i < (begin + end + 1) / 2; i++) {
            temp = nums[i];
            nums[i] = nums[end - j];
            nums[end - j] = temp;
            j++;
        }
    }

    public static void main(String[] args) {

        RotateArray r = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12};
        r.rotate(nums, 3);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
