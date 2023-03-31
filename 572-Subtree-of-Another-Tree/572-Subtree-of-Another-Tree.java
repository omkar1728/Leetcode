/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean ans = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {     
        if(subRoot == null) return true;  
        dfs(root, subRoot);
        return ans;
    }
    private boolean isSame(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)return true;
        if(root1 == null || root2 == null)return false;
        if(root1.val != root2.val) return false;
        return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    }
    private void dfs(TreeNode root, TreeNode subRoot){
        if(root == null) return;
        if(root.val == subRoot.val) {
            if(isSame(root, subRoot)){
                ans = true;
            }
        }
        dfs(root.left, subRoot);
        dfs(root.right, subRoot);
    }
}