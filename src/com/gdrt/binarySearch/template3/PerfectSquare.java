package com.gdrt.binarySearch.template3;

public class PerfectSquare {
    // num >= 0
    public boolean isPerfectSquare(int num) {

        int a = 1;
        int b = num/2;
        while (a + 1 < b) {
            int mid = a + (b - a) / 2;
            int check = num/mid;
            if (check == mid)
                return check * check == num;
            if (check < mid)
                b = mid;
            else
                a = mid;
        }
        return a * a == num || b * b == num;
    }
}
