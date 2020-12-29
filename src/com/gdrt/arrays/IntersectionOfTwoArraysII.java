package com.gdrt.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return list.stream().mapToInt(k -> k).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2,3,4,4,4,7,12,12};
        int[] nums2 = {2,-9,4,12,3,3,3,3,3,5,-5,5,5,9998,56561,-1,0};
        IntersectionOfTwoArraysII in = new IntersectionOfTwoArraysII();
        int[] res = in.intersect(nums1, nums2);
        for (int r : res) {
            System.out.println(r + " ");
        }
    }
}
