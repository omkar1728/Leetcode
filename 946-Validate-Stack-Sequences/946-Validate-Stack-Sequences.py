class Solution:
    def validateStackSequences(self, pushed: List[int], popped: List[int]) -> bool:
        stack = []
        p = 0
        for i in pushed:
            stack.append(i)
            while stack and stack[-1] == popped[p]:
                stack.pop()
                p += 1
        print(stack)
        for i in popped[p:]:
            if i  != stack.pop():
                return False

        return True