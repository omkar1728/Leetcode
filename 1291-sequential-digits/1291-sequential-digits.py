class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        ans = []

        def make(start_num, length):
            end_num = start_num + length - 1
            while end_num <= 9:
                num = ""
                for i in range(start_num, end_num + 1):
                    num += str(i)
                #print(num)
                if int(num) > high:
                    return
                if int(num) >= low:
                    ans.append(int(num))
                start_num += 1
                end_num += 1

        low_len = len(str(low))
        high_len = len(str(high))
        low_start = int(str(low)[0])

        for i in range(low_len, high_len+1):
            #print(i)
            make(1, i)
        return ans
        