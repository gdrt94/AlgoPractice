package com.gdrt.binarySearch.rotated;

public class MinimumInRotatedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[left]) {
                left = left + 1;
                right = mid;
            } else {
                return nums[left];
            }
        }
        return -1;
    }
}