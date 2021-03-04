package com.gdrt.dynamicProgramming;

public class BestTimeToBuyAndSellStock {
    public int maxProfitBadSolution(int[] prices) {
        //This solution is bad as it needs extra memory. Look below for better one
        int[] mins = new int[prices.length];
        int[] maxs = new int[prices.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0, j = prices.length - 1; i < prices.length; i++, j--) {
            if (prices[i] < min) {
                mins[i] = prices[i];
                min = prices[i];
            } else {
                mins[i] = min;
            }
            if (prices[j] > max) {
                maxs[j] = prices[j];
                max = prices[j];
            } else {
                maxs[j] = max;
            }
        }
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            int temp = maxs[i] - mins[i];
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
            } else {
                int diff = prices[i] - min;
                if (diff > profit) {
                    profit = diff;
                }
            }
        }
        return profit;
    }

        public static void main(String[] args) {
        BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
        int[] arr = {7,21,0,12,1,2};
        System.out.println(b.maxProfit(arr));
    }
}
