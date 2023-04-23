class Solution:
    def checkArithmeticSubarrays(self, nums: List[int], l: List[int], r: List[int]) -> List[bool]:
        def isAri(nums):
            if len(nums) <= 1:
                return True
            nums.sort()
            diff = nums[1] - nums[0]
            for i in range(2,len(nums)):
                if nums[i] - nums[i-1] != diff:
                    return False
            return True
        
        ans = []
        for i in range(len(l)):
            ans.append(isAri(nums[l[i]:r[i]+1]))
        return ans

