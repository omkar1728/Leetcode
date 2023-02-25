121-Best-Time-to-Buy-and-Sell-Stock



Java
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/904459645/
Runtime
2 ms
Beats
63.52%
Memory
59.5 MB
Beats
19.14%
Older brute force attempts
class Solution {
    public int maxProfit(int[] prices) {
        int Profit = 0;
        int[] futureMax = new int[prices.length];
        int[] pastMin = new int[prices.length];
        int currMin = prices[0];
        int currMax = prices[prices.length - 1];
        for(int i = prices.length -1; i >=0; i--){
            if (currMax < prices[i]){
                currMax = prices[i];
            }
            futureMax[i] = currMax;
        }
        Collections.reverse(Arrays.asList(futureMax));

        for(int  i = 0; i < prices.length; i++){
            if (currMin > prices[i]){
                currMin = prices[i];
            }
            pastMin[i] = currMin;
        }

        for(int  i = 0; i < prices.length; i++){
            if (futureMax[i] - pastMin[i] > Profit){
                Profit = futureMax[i] - pastMin[i];
            }
        }
        return Profit;
    }
}


Python3
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/904460899/
Runtime
1102 ms
Beats
55.50%
Memory
25 MB
Beats
82.91%

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        futureMax = []
        pastMin = []
        currMin=  prices[0]
        currMax = prices[-1]
        prices.reverse()
        temp = prices
        for i in temp:
            if currMax < i:
                currMax = i
            futureMax.append(currMax)
        prices.reverse()
        for i in prices:
            if currMin > i:
                currMin = 1
            pastMin.append(i)
        futureMax.reverse()
        Profit = 0
        for i in range(len(prices)):
            if futureMax[i] - pastMin[i] > Profit:
                Profit = futureMax[i] - pastMin[i]
        return Profit


        # 150/211 O(n)
        # start = 0
        # end = len(prices) -1 
        # currMin=  100000
        # currMax = -1
        # while start <= end:
        #     if prices[start] < currMin:
        #         currMin = prices[start]
        #     start += 1
        #     if prices[end] > currMax:
        #         currMax = prices[end]
        #     end -= 1

        # if currMax > currMin:
        #     return currMax - currMin
        # return 0  
        
        #198/211 O(n2) solution
        # currMax = 0
        # buy = -1
        # sell = -1
        # for i in range(0,len(prices)):
        #     for j in range(i,len(prices)):
        #         if prices[j] - prices[i] > currMax:
        #             currMax = prices[j] - prices[i]
        # return currMax
