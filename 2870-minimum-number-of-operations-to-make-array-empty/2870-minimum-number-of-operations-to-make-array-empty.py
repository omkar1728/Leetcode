class Solution:
    def minOperations(self, nums: List[int]) -> int:
        ans = 0
        d = {}
        for i in nums:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
        
        for i in d.keys():
            if d[i] == 1:
                return -1
            elif d[i]%3 != 0:
                ans += d[i]//3 + 1
            else:
                ans += d[i]//3

        return ans