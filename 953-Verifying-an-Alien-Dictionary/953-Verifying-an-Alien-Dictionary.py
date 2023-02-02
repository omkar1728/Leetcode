class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        if len(words) == 1:
            return True
        def sorted(a,b):
            if a == b:
                return True
            allsame = True
            length = min(len(a), len(b))
            for i in range(length):
                if a[i] != b[i]:
                    allsame = False
                if order.index(a[i]) < order.index(b[i]):           
                    return True
                if order.index(a[i]) > order.index(b[i]):           
                    return False
                

            print("exited lop")
            if len(a) < len(b) and allsame:
                return True
            else:
                return False

        for i in range(1, len(words)):
            if not sorted(words[i-1], words[i]):
                return False
        return True