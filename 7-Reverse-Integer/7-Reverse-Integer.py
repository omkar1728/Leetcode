class Solution:
    def reverse(self, x: int) -> int:
        if x == 0:
            return 0
        sign  = 1
        if x < 0:
            sign  = -1
        x = sign*x
        x = str(x)
        x = x[::-1]
        x = int(x)
        if x < (-1)*(2**31) or x > (2**31 - 1):
            return 0
        return x*sign
        