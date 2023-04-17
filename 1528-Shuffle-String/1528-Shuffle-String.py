class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        d = {}
        for i in range(len(s)):
            d[indices[i]] = s[i]
        ans = ""
        for i in range(len(s)):
            ans += d[i]
        return ans