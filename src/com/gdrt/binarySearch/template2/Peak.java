package com.gdrt.binarySearch.template2;

public class Peak {
    // findPeakElement
    // as leftmost element is -∞, the sequence is increasing in the beginning: all we need to do is
    // to find the first element that decreases the sequence.
    // similarly as rightmost element is -∞, the sequence is decreasing in the end, hence
    // we need to find the last element that increases the sequence.

    public int findPeakElement(int[] nums) {

        if (nums == null || nums.length == 0)
            return -1;
        int a = -1; int b = nums.length;
        while (true) {
            int mid = a + (b - a) / 2;
            int leftOfMid = mid == 0 ? Integer.MIN_VALUE : nums[mid - 1];
            int rightOfMid = mid == nums.length - 1  ? Integer.MIN_VALUE : nums[mid + 1];
            if (leftOfMid <= nums[mid] && nums[mid] >= rightOfMid) {
                return mid;
            }
            if (nums[mid] <= rightOfMid)
                a = mid;
            else if (nums[mid] <= leftOfMid)
                b = mid;
        }
    }
}

//-∞ 1  5  3 -∞
