class Solution:
    def minDeletionSize(self, strs: List[str]) -> int:
        n = len(strs)
        count = 0
        for i in range(len(strs[0])):
            string = []
            for j in range(n):
                string.append(strs[j][i])
            temp = sorted(string)
            print(string, "   ", temp)
            if temp != string:
                count += 1
        print(count)
        return count
