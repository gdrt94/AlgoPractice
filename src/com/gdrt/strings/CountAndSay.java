package com.gdrt.strings;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n-1);
        StringBuilder newStr = new StringBuilder();

        char[] s = str.toCharArray();
        char prev = s[0];
        int count = 1;
        for (int i = 1; i < s.length; i++) {
            if (prev == s[i]) {
                count++;
            } else {
                newStr.append(count).append(prev);
                count = 1;
            }
            prev = s[i];
        }
        newStr.append(count).append(prev);
        return newStr.toString();
    }

    public static void main(String[] args) {
        CountAndSay c = new CountAndSay();
        for (int i = 1; i <= 30; i++) {
            System.out.println(c.countAndSay(i));
        }
    }
}
