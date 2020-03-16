package com.gdrt.binarySearch.template1;

public class SquareRoot {

    public int mySqrt(int x) {

        if (x == 0 || x == 1)
            return x;

        int a = 1;
        int b = x / 2;
        while (a <= b) {

            int mid = a + (b - a) / 2;
            int ans = x/mid;
            if (ans == mid)
                return mid;
            if (mid > ans)
                b = mid - 1;
            else
                a = mid + 1;
        }
        return b;
    }
}
