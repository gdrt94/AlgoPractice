package com.gdrt.dynamicProgramming;

import java.util.*;

public class IsSubsequence {

    Map<Character, List<Integer>> alphabet;
    public boolean isSubsequence(String s, String t) {
        initializeAlphabet();
        fillAlphabet(t);

        int indexOfCurrentCharInT = -1;
        char[] sArr = s.toCharArray();
        for(char c : sArr) {
            List<Integer> list = alphabet.get(c);
            int position = Collections.binarySearch(list, ++indexOfCurrentCharInT);
            if (position < 0) {
                position = - position - 1;
                if (position == list.size()) {
                    return false;
                }
                indexOfCurrentCharInT = list.get(position);
            }
        }
        return true;
    }

    private void initializeAlphabet() {
        alphabet = new HashMap<>();
        for (int i = 97; i < 123; i++) {
            alphabet.put((char) i, new ArrayList<>());
        }
    }

    private void fillAlphabet(String t) {
        char[] tArr = t.toCharArray();
        for (int i = 0; i < tArr.length; i++) {
            alphabet.get(tArr[i]).add(i);
        }
    }

    public static void main(String[] args) {
        IsSubsequence is = new IsSubsequence();
//        is.initializeAlphabet();
//        for (Character c : is.alphabet.keySet())
//            System.out.println(c);
        List<Integer> aList = new ArrayList<>();
//        aList.add(1);
//        aList.add(12);
//        aList.add(16);
//        aList.add(17);
//        aList.add(19);
//        aList.add(25);
//        aList.add(29);
        System.out.println(Collections.binarySearch(aList, 30));
    }
}
