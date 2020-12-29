package com.gdrt.arrays;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum ^ num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,5,7,4,-1,-1,4,1,7};
        SingleNumber s = new SingleNumber();
        System.out.println(s.singleNumber(nums));
    }
}
