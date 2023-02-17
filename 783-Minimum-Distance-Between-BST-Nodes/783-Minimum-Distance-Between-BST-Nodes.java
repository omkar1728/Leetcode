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
    int min = 1000;
    TreeNode prev = null;

    private void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        if(prev != null){
            min = Math.min(root.val - prev.val, min);
        }
        prev = root;

        inorder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        inorder(root);

        return min;
    }
   
}