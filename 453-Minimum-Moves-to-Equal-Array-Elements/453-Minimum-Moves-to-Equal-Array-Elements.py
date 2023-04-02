class Solution:
    def minMoves(self, nums: List[int]) -> int:
        small = 100000000000
        for i in nums:
            small = min(small,i)
        return sum(nums) - len(nums)*small
      