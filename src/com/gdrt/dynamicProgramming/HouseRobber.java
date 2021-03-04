package com.gdrt.dynamicProgramming;

public class HouseRobber {
    public int robUgly(int[] nums) {

        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length > 2)
            nums[2] += nums[0];

        for (int i = 3; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 2], nums[i - 3]);
        }
        return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }

    public int rob(int[] nums) {

        int prevMax = 0;
        int curMax = 0;

        for(int num: nums){
            int temp = curMax;
            curMax = Math.max(prevMax+num, curMax);
            prevMax = temp;
        }
        return curMax;
    }

    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int[] arr = {2,7,9,3,1};
        System.out.println(hr.rob(arr));
    }
}
