package com.gdrt.dynamicProgramming;

import java.util.Arrays;

public class ClimbingStairs {
    int[] mem;

    public int climbStairs(int n) {
        mem = new int[46];
        mem[1] = 1;
        mem[2] = 2;

        return doo(n);
    }

    int doo (int n) {
        if (mem[n] == 0) {
            mem[n] = doo(n-1) + doo(n-2);
        }
        return mem[n];
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(45));
    }
}
