class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        d = {}
        for i in s:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
        

        # for i in t:
        #     if i not in d:
        #         return False
        # return True

        for i in t:
            if i not in d:
                print(" due to 1")
                return False
            elif d[i] == 0:
                print(" due to 2")
                return False
            else:
                d[i] -= 1
        return True
            
            