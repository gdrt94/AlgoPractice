package com.gdrt.binarySearch.template1;

public class BinarySearch {

    public int search(int[] nums, int target) {

        if (nums == null)
            return -1;

        int a = 0;
        int b = nums.length - 1;
        while (a <= b) {
            int mid = a + (b - a) / 2; // same as (a + b)/2; it's done to prevent overflow
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                b = mid - 1;
            else
                a = mid + 1;
        }
        return -1;
    }
}
