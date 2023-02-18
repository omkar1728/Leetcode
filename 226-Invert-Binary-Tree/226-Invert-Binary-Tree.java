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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        return invert(root);

    }
    private static TreeNode invert(TreeNode root){
        if(root == null) return null;
        if(root.right == null && root.left == null) return root;
        TreeNode right = invert(root.right);
        TreeNode left = invert(root.left);
        TreeNode temp = right;
        root.right = left;
        root.left = temp;
        return root;

    }
}