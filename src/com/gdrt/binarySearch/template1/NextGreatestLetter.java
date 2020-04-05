package com.gdrt.binarySearch.template1;

public class NextGreatestLetter {

    public char nextGreatestLetter(char[] letters, char target) {

        if(letters[0] > target || target >= letters[letters.length - 1])
            return letters[0];

        int a = 0, b = letters.length - 1;
        while(a <= b) {
            int mid = a + (b - a) / 2;
            if(letters[mid] > target && letters[mid-1] <= target)
                return letters[mid];
            if(letters[mid] > target)
                b = mid - 1;
            else
                a = mid + 1;
        }
        return letters[0];
    }

}
