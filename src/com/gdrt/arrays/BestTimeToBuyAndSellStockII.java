package com.gdrt.arrays;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {

            int dif = prices[i] - prices[i-1];
            if (dif > 0) {
                profit += dif;
            }
        }
        return profit;
    }
}
