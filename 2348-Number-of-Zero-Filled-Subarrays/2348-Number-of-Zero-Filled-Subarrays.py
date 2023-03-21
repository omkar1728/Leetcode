class Solution:
    def zeroFilledSubarray(self, nums: List[int]) -> int:
        ans = 0
        n = 0 
        nums = [1] + nums
        while len(nums) > 0:
            element = nums.pop()
            if element == 0:
                n += 1
            else:
                ans += (n * (n+1) )/2
                n = 0
            
        return int(ans)