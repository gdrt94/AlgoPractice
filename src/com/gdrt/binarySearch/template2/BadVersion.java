package com.gdrt.binarySearch.template2;

public class BadVersion {
    public int firstBadVersion(int n) {

        // it should have been implemented with template 2 but was implemented with kind of template 1
        int a = 1;
        int b = n;
        if(isBadVersion(1))
            return 1;

        while(a < b) {

            if(a == b - 1)
                return b;

            int mid = a + (b - a) / 2;
            boolean isBad = isBadVersion(mid);
            if(isBad)
                b = mid;
            else
                a = mid;
        }
        return -1;
    }

    boolean isBadVersion(int n) {
        return n >= 20;
    }
}
