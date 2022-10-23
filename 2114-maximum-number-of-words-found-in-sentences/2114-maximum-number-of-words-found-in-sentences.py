class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        mx = 0
        for i in sentences:
            print(len(i.split(" ")))
            if mx < len(i.split(" ")):
                mx = len(i.split(" "))
                         
        return mx