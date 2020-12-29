package com.gdrt.arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int nonZeroNums = 0;
        for(int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                if (nonZeroNums < i) {
                    nums[nonZeroNums] = nums[i];
                    nums[i] = 0;
                }
                nonZeroNums++;
            }
        }
    }

    public static void main(String[] args) {
//        int[] ns = {0, 1, 0, 3, 12};
//        int[] ns = {1,0,1};
        int[] ns = {2,1};
        MoveZeroes m = new MoveZeroes();
        m.moveZeroes(ns);
        for (int n : ns) {
            System.out.println(n + " ");
        }
    }
}

