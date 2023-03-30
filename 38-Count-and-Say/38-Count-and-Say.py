class Solution:
    def countAndSay(self, n: int) -> str:
        def say(n):
            count = 1
            ans = ""
            curr = n[0]
            for i in n[1:]:
                if i  == curr:
                    count += 1
                else:
                    ans = ans + str(count) + str(curr)
                    curr = i
                    count = 1
            
            ans = ans + str(count) + str(curr)
            return ans
        ans = "1"
        for i in range(n-1):
            ans = say(ans)
        return ans
        
    