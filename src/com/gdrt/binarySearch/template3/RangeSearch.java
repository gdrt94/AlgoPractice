package com.gdrt.binarySearch.template3;

public class RangeSearch {

    // IS NOT COMPLETED
    // Run binary search twice
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        if (nums == null || nums.length == 0)
            return ans;
        int a = 0; int b = nums.length - 1;

        while (a + 1 < b && nums[a+1] != nums[b-1]) {

            int mid = a + (b - a) / 2;
            if (nums[mid] == target) {

            } else if (nums[mid] > target)
                b = mid - 1;
            else
                a = mid + 1;
        }

        return ans;
    }

}
