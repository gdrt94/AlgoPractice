package com.gdrt.binarySearch.range;

public class SearchForRange {
    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[] {-1, -1};
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                right = mid;
            }
        }

        int start = left;
        if (nums[start] != target) {
            return new int[] {-1, -1};
        }

        right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return new int[] {start, right};
    }
}