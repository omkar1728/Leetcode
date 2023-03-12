class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        backup = heights.copy()
        heights.sort()
        count = 0
        print(backup)
        print(heights)
        for i in range(len(heights)):
            if heights[i] != backup[i]:
                count += 1
        return count