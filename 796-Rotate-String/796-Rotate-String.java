class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        def rotate(s):
            temp = s.pop(0)
            s.append(temp)

        if s == goal:
            return True
        goal = list(goal)
        og = list(s)
        s = list(s)
        while True:
            rotate(s)
            if s == goal:
                return True
            if s == og:
                return False

            

