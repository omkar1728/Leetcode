class Solution:
    def winnerOfGame(self, colors: str) -> bool:
        #colors = list(colors)
        alice = 0 
        bob = 0 
        count = 0
        A = colors.split('B')
        B = colors.split('A')
    
        for i in A:
            if len(i) >= 3:
                alice += len(i) - 2
        for i in B:
            if len(i) >= 3:
                bob += len(i) - 2

        
        







        # for i in colors:
        #     if i == 'A':
        #         count += 1
        #     else:
        #         if count <= 2:
        #             count = 0
        #         else:
        #             alice += count - 2
        # if count <= 2:
        #     count = 0
        # else:
        #     alice += count - 2
        
        # count = 0
        # for i in colors:
        #     if i == 'B':
        #         count += 1
        #     else:
        #         if count <= 2:
        #             count = 0
        #         else:
        #             bob += count - 2
        # if count <= 2:
        #     count = 0
        # else:
        #     bob += count - 2
        print(alice, bob)
        if alice > bob:
            return True
        else:
            return False
        











        # def find(c):
        #     idx = 0
        #     count = 0
        #     for i in range(len(colors)):
        #         if colors[i] == c:
        #             if count == 0:
        #                 idx = i
        #             count += 1
        #         else:
        #             count = 0 
        #         if count == 3:
        #             return idx + 1
        #     return False
        # def alice():
        #     idx = find('A')
        #     if idx:
        #         colors.pop(idx)
        #     else:
        #         return True
        # def bob():
        #     idx = find('B')
        #     if idx:
        #         colors.pop(idx)
        #     else:
        #         return True
        # while(len(colors) > 0 ):
        #     if(alice()):
        #         return False
        #     if(bob()):
        #         return True
        # # print(colors)
        # # print(find('A'))
        # # alice()
        # # alice()
        # # print(colors)
        # return False
        
                