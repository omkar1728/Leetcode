class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        dev = []
        for row in bank:
            count = 0
            for j in row:
                if j == '1':
                    count += 1
            if count != 0:
                dev.append(count)
        ans = 0
        for i in range(len(dev) - 1):
            ans += dev[i] * dev[i + 1]
        return ans
        