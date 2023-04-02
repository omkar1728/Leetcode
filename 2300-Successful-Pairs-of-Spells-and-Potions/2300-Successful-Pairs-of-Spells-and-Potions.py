class Solution:
    def successfulPairs(self, spells: List[int], potions: List[int], success: int) -> List[int]:
        pairs = []
        potions.sort()
        #print(potions)
        for spell in spells:
            start = 0
            end = len(potions) - 1
            mvs = len(potions) #minimum viable solution
            while start <= end:
                mid = (start + end)//2
                if potions[mid] * spell >= success:
                    end = mid - 1
                    mvs = mid
                else:
                    start = mid + 1
            pairs.append(len(potions) - mvs)
        return pairs