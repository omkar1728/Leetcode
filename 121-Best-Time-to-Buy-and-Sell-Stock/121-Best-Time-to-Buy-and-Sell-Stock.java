class Solution {
    public int maxProfit(int[] prices) {
        int currMin = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            currMin = Math.min(prices[i], currMin);
            profit = Math.max(profit, prices[i] - currMin);
        }
        return profit;
    }
}