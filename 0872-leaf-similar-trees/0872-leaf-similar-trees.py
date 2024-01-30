# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:

        t1 = []
        t2 = []
        def t(root, seq):
            if(root == None):
                return
            if(root.left == None and root.right == None):
                seq.append(root.val)
                return 
            t(root.left,seq)
            t(root.right,seq)
        t(root1,t1)        
        t(root2,t2)
        if len(t1) != len(t2):
            return False
        for i in range(len(t1)):
            if t1[i] != t2[i]:
                return False
        return True        