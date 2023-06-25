class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        ans = ""
        longest = ""
        for i in strs:
            if len(i) > len(longest):
                longest = i
            if i == "":
                return ans

        for i in range(len(longest)):
            for j in strs:
                if len(j) <= i:
                    return ans
                else:
                    if j[i] != longest[i]:
                        return ans
            ans += longest[i]
        return ans 
                