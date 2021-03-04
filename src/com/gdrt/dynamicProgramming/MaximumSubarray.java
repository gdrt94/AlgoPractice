package com.gdrt.dynamicProgramming;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int finalSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            finalSum = Math.max(finalSum, sum);
        }
        return finalSum;
    }

    public static void main(String[] args) {
        MaximumSubarray ms = new MaximumSubarray();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ms.maxSubArray(arr));
    }
}
