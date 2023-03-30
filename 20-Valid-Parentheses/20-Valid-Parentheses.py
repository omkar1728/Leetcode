class Solution:
    def isValid(self, s: str) -> bool:
        m = { ')' : '(', ']' : '[', '}' : '{'}
        stack = []
        for i in s:
            if i in m:
                if stack and m[i] == stack[-1]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(i)
        return len(stack) == 0
        #brute force
        # opening = ['[', '{', '(']
        # stack = []
        # for i in s:
        #     if len(stack) == 0:
        #         stack.append(i)
        #     else:
        #         if i in opening:
        #             stack.append(i)
        #         else:
        #             if stack[-1] == '(' and i == ')':
        #                 stack.pop()
        #             else:
        #                 if stack[-1] == '[' and i == ']':
        #                     stack.pop()
        #                 else:
        #                     if stack[-1] == '{' and i == '}':
        #                         stack.pop()
        #                     else:
        #                         stack.append(i)
        # return len(stack) == 0