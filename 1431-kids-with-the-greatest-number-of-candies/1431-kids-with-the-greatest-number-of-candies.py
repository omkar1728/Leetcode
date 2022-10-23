class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        mx = max(candies) - extraCandies
        arr = []
        for i in candies:
            if i >= mx:
                arr.append(True)
            else:
                arr.append(False)
                
        return arr