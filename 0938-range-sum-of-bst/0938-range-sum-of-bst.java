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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        t(root, low, high);
        return sum;
    }
    private void t(TreeNode root,int low, int high){
        if(root == null) return;
        if(root.val >= low && root.val <= high ){
            sum += root.val;
            t(root.left,low,high);
            t(root.right,low,high);
            return;
        }
        if(root.val < low ){
            t(root.right,low,high);
            return;
            
        }
        if(root.val > high ){
            t(root.left,low,high);
            return;
        }
    }
}