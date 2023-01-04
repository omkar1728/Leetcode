class Solution:
    def minimumRounds(self, tasks: List[int]) -> int:
        map = {}
        for i in tasks:
            if i in map:
                map[i] += 1
            else:
                map[i] = 1
        
        if 1 in map.values():
            return -1
        rounds = 0
        for i in map.keys():
            while(map[i] != 0 ):
                if map[i] == 4:
                    rounds += 2
                    map[i] = 0
                    break
                if map[i] == 2 or map[i] == 3:
                    rounds += 1
                    map[i] = 0
                    break

                map[i] -= 3
                rounds += 1
        return rounds