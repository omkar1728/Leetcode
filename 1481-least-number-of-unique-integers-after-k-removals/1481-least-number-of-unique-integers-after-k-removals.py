class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        d = {}
        for i in arr:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
        v = list(d.values())
        if k== 0:
            return len(v)
        v.sort()
        for i in range(len(v)):
            if k >= v[i]:
                k -= v[i]
                v[i] = 0
            else:
                return len(v) - i
                break
        count = 0
        for i in v:
            if i == 0:
                count += 1
            else:
                break
        return len(v) - count
