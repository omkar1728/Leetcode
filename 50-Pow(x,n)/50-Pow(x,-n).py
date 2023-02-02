class Solution:
    def myPow(self, x: float, n: int) -> float:
        if(n == 0):
            return 1
        if x == 1:
            return 1
        d = {}
        def calc(x,n):
            if n == 1:
                return x
            if n == 2:
                return x * x
            if n in d:
                return d[n]
            d[n] = calc(x,n//2) * calc(x,n - n//2)
            return d[n]


        if n > 0:
            ans = calc(x,n)
            return ans
        else:
            ans = 1/calc(x,-1 * n)
            return ans

        