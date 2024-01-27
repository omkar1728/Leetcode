class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        ans = []
        while len(nums) > 0:
            s = set(nums)
            ans.append(list(s))
            for i in ans[-1]:
                nums.remove(i)
        return ans
        