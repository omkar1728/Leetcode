class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        digit = 0
        for i in nums:
            for j in str(i):
                digit += int(j)
        diff = digit - sum(nums)
        if diff < 0:
            return -1 * diff
        return diff