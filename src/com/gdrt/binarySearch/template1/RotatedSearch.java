package com.gdrt.binarySearch.template1;

public class RotatedSearch {

    public int search(int[] nums, int target) {

        if (nums == null || nums.length == 0)
            return -1;

        int left = 0; int right = nums.length - 1;
        while (nums[left] > nums[right]) {
            if (left == right - 1) {
                left = right;
                break;
            }
            int mid = left + (right - left) / 2;
            if (nums[left] > nums[mid] && nums[mid] < nums[right]) {
                left = left + 1;
                right = mid;
            } else if (nums[left] > nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[left] < nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[left] < nums[mid] && nums[mid] < nums[right])
                break;
        }

        if (left == 0) {
            right = nums.length - 1;
        } else if (nums[0] <= target && target <= nums[left - 1]) {
            right = left - 1;
            left = 0;
        } else if (nums[left] <= target && target <= nums[nums.length - 1]) {
            right = nums.length - 1;
        } else {
            return -1;
        }

        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                right = mid - 1;
            else if (nums[mid] < target)
                left = mid + 1;
        }
        return -1;
    }
}
