class Solution:
    def freqAlphabets(self, s: str) -> str:
        ans  = ""
        p = 0
        #print(str(chr(97)))
        while p < len(s):
            if p < len(s) - 2 and s[p+2] == '#':
                ans += str(chr(int(s[p:p+2]) + 96))
                p += 3
            else:
                ans += str(chr(int(s[p]) + 96))
                p += 1
                

        return ans