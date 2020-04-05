package com.gdrt.binarySearch.recursion;

public class Power {

    //  pow(x, n)

    // -100.0 < x < 100.0
    // n is a 32-bit signed integer, within the range [−231, 231 − 1]

    public double myPow(double x, int n) {
        if (x == 0 && n > 0)
            return 0;
        if (n == 0 || x == 1)
            return 1;
        if (n == Integer.MIN_VALUE) {
            return myPow(1/x, Integer.MAX_VALUE) * 1/x;
        }

        if (n > 0)
            return pow(x, n);
        return 1/pow(x, -n);
    }

    private double pow(double x, int n) {
        if (n == 1)
            return x;
        else if (n == 2)
            return x*x;
        else if (n % 2 == 0) {
            return pow(x*x, n/2);
        } else {
            return x * pow(x*x, n/2);
        }
    }
}
