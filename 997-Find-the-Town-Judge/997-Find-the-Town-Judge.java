class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        if n == 1:
            return 1
        def isJ(i, l):
            temp = [0]*n
            temp[i-1] = 1
            for j in l:
                temp[j-1] = 1
            print(temp)
            if 0 in temp:
                return False
            return True
        d = {}
        for i in trust:
            if i[1] not in d:
                d[i[1]] = [i[0]]
            else:
                d[i[1]].append(i[0])
        print(d)
        trusting =  []
        for i in d.keys():
            for j in d[i]:
                trusting.append(j)
        for i in d.keys():
            if isJ(i, d[i]) and i not in trusting:
                return i
        return -1
    