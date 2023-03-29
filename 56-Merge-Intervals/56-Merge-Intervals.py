class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        #https://www.youtube.com/watch?v=44H3cEC2fFM
        intervals.sort(key = lambda i : i[0])
        ans = [intervals[0]]
        for start,end in intervals[1:]:
            if start <= ans[-1][1]:
                ans[-1][1] = max(end, ans[-1][1])
            else:
                ans.append([start,end])
        return ans