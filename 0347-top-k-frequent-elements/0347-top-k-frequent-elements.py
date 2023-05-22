class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        d = {}
        ans = []
        for i in nums:
            if i in d:
                d[i]  += 1
            else:
                d[i] = 1 
        keys = list(d.keys())
        values = list(d.values())
        combined = list(zip(keys,values))
        combined.sort(key = lambda x : x[1])

        last = -1
        while k != 0:
            ans.append(combined[last][0])
            k -= 1
            last -= 1
        return ans
            