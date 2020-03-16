package com.gdrt.binarySearch;

import com.gdrt.binarySearch.template1.BinarySearch;
import com.gdrt.binarySearch.template1.RotatedSearch;
import com.gdrt.binarySearch.template1.SquareRoot;

public class RunBinarySearch {

    public static void main(String[] args) {
//        search();
//        sqrt();
        rotated();
    }

    static void search() {
        BinarySearch bs = new BinarySearch();
        int[] nums = null; //{-1,0,3,5,9,12};
        //{-1,0,3,5,9,12};
        int target = 9;
        int res = bs.search(nums, target);
        System.out.println(res);
    }
    static void sqrt() {
        SquareRoot sr = new SquareRoot();
        for (int i = 0; i <= 100; i++) {
            System.out.println("Number: " + i + ", square root: "  + sr.mySqrt(i));
        }
        int i = 2147395599;
        System.out.println("Number: " + i + ", square root: "  + sr.mySqrt(i));
    }
    static void rotated() {

        RotatedSearch rs = new RotatedSearch();
        int[] nums = {5};
        int target = 5;
        int ans = rs.search(nums, target);
        System.out.println(ans);
    }
}
