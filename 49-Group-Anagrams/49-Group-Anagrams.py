class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs) == 1:
            return [strs]
        maps = []
        ans = []
        for i in strs:
            d = {}
            for j in i:
                if j in d:
                    d[j] += 1
                else:
                    d[j] =  1
            maps.append(d)

        final = {}
        for i in range(len(strs)):
            final[strs[i]] = maps[i]
        print(final)
        while(len(strs) != 0):
            key = final[strs[0]]
            temp = []
            temp.append(strs[0])
            strs.pop(0)
            for i in strs:
                if final[i] == key:
                    temp.append(i)
            for i in temp:
                if i in strs:
                    strs.remove(i)

            ans.append(temp)
        return ans

        