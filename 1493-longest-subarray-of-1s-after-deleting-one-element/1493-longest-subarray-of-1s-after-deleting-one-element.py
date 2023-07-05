class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        start = 0 
        end = 0
        seq = []
        i = 0
        while i < len(nums):
            while i < len(nums) and nums[i] != 1:
                i += 1
            start = i
            while i < len(nums) and nums[i] != 0:
                i += 1
            end = i - 1
            if start  <=  end: 
                seq.append([start, end ])
        ans = 0
        if len(seq) == 0:
            return ans
        if len(seq) == 1:
            if seq[0][1] - seq[0][0] + 1 == len(nums):
                return len(nums) - 1
            else: 
                return seq[0][1] - seq[0][0] + 1
        max_seq = seq[0][1] - seq[0][0] +  1
        for i in range(1,len(seq)):
            if seq[i][0] - seq[i- 1][1] == 2:
                ans = max(ans , seq[i][1] - seq[i - 1][0])
            max_seq = max( max_seq ,seq[i][1] - seq[i][0] + 1)
            
        return max(ans, max_seq)
