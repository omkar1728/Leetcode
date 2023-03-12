class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        s1 = s1.split(" ")
        s2 = s2.split(" ")
        ans = []
        d = {}
        for i in s1:
            if i not in d:
                d[i] = 1 
            else:
                d[i] += 1
        for i in s2:
            if i not in d:
                d[i] = 1 
            else:
                d[i] += 1
        
        for i in s1:
            if i not in s2 and d[i] == 1:
                ans.append(i)
        for i in s2:
            if i not in s1 and d[i] == 1:
                ans.append(i)
        return ans