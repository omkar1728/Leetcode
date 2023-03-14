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
    static int sum = 0;
    public int sumNumbers(TreeNode root) {
        //if(root == null) reutrn 
        sum = 0;
        t(root, 0);
        return sum;
    }
    private void t(TreeNode root, int curr){
        if(root.left == null && root.right == null){
            curr = curr*10 + root.val;
            sum += curr;
            return;
        }
        curr = curr*10 + root.val;
        if(root.left != null) {t(root.left, curr);}
        if(root.right != null) {t(root.right, curr);}
        
    }
}