package com.gdrt.binarySearch;

import com.gdrt.binarySearch.template1.BinarySearch;
import com.gdrt.binarySearch.template1.NextGreatestLetter;
import com.gdrt.binarySearch.template1.RotatedSearch;
import com.gdrt.binarySearch.template1.SquareRoot;
import com.gdrt.binarySearch.template2.Peak;
import com.gdrt.binarySearch.template3.PerfectSquare;

public class RunBinarySearch {

    public static void main(String[] args) {
//        search();
//        sqrt();
//        rotated();
//        peak();
//        pr();
        letters();
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
    static void peak() {
        //[1,2,1,3,5,6,4]
        Peak p = new Peak();
        int[] nums = {1,2,3,1};
        System.out.println(
                p.findPeakElement(nums)
        );
    }
    static void pr() {
        PerfectSquare p = new PerfectSquare();
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " " + p.isPerfectSquare(i));
        }
        System.out.println(3364 + " " + p.isPerfectSquare(3363));
        System.out.println(3364 + " " + p.isPerfectSquare(3364));
        System.out.println(3364 + " " + p.isPerfectSquare(3365));
        System.out.println(2147395599 + " " + p.isPerfectSquare(2147395599));
        System.out.println(2147395600 + " " + p.isPerfectSquare(2147395600));
        System.out.println(2147395601 + " " + p.isPerfectSquare(2147395601));
        System.out.println(Integer.MAX_VALUE + " " + p.isPerfectSquare(Integer.MAX_VALUE));
    }
    static void letters() {
        NextGreatestLetter ngl = new NextGreatestLetter();
        char[] letters = {'b','b','c'};
        char target = 'z';
        System.out.println(
                ngl.nextGreatestLetter(letters, target)
        );
    }
}
