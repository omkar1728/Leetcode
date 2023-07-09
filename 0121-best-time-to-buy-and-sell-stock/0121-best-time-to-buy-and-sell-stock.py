class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        currMin = prices[0]
        for i in prices[1:]:
            currMin = min(currMin, i)
            profit = max(profit, i - currMin)
        return profit