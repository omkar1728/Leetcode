class Solution:
    def minFlips(self, a: int, b: int, c: int) -> int:
        def convert(a):
            abin = []
            while a > 0:
                abin.append(a%2)
                a = a//2
            return abin
        def align(l, x):
            while len(l) != x:
                l.append(0)

        abin = convert(a)
        bbin = convert(b)
        cbin = convert(c)
        n = max(len(abin), len(bbin), len(cbin))
        align(abin,n)
        align(bbin,n)
        align(cbin,n)
        ans = 0
        for i in range(n):
            if cbin[i] == 0:
                ans += abin[i] + bbin[i]
            else:
                if abin[i] + bbin[i] == 0:
                    ans += 1
                 

        return ans
        