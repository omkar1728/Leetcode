class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # back = len(nums) - 1
        # for i in range(len(nums)):
        #     if nums[i] == 0 and i < back :
        #         nums[i],nums[back] = nums[back],nums[i]
        #         back -= 1
        count = 0
        for i in nums:
            if i == 0:
                count += 1
        for i in range(count):
            nums.remove(0)
        for i in range(count):
            nums.append(0)
            