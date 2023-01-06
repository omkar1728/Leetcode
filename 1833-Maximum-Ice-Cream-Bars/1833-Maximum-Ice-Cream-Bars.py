class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        costs.sort()
        iceCream = 0
        for i in costs: 
            if i <= coins:
                coins -= i
                iceCream +=1
        return iceCream