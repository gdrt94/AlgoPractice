package com.gdrt.arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] ret = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ret[k++] = nums1[i];
                i++;
            } else {
                ret[k++] = nums2[j];
                j++;
            }
        }

        for (int ii = i; ii < m; ii++)
            ret[k++] = nums1[ii];
        for (int jj = j; jj < n; jj++)
            ret[k++] = nums2[jj];

        for (int z = 0; z < ret.length; z++)
            nums1[z] = ret[z];
    }
}
