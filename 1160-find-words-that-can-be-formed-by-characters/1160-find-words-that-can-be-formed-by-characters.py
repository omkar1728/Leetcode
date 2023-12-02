class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        def isGood(table,d):
            for i in d.keys():
                if i not in table:
                    return False
                if d[i] > table[i]:
                    return False
            return True

        ans = 0
        d = {}
        table = {}
        for i in chars:
            if i in table:
                table[i] += 1
            else:
                table[i] = 1
        for i in words:
            for j in i:
                if j in d:
                    d[j] += 1
                else:
                    d[j] = 1
            if isGood(table,d):
                ans += len(i)
            d = {}
    
        return ans
        