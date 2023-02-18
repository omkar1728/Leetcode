# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root == None:
            return None
        def invert(root):
            if root == None:
                return
            temp = root.right
            root.right = root.left
            root.left = temp
            invert(root.left)
            invert(root.right)
        invert(root)
        return root