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
    public boolean isCompleteTree(TreeNode root) {
        if(root.left == null && root.right == null ) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() != 0){
            TreeNode temp = q.remove();
            if(temp == null){
                while(q.size() != 0){
                    TreeNode t = q.remove();
                    if(t != null) return false;
                }
            } else {
                q.add(temp.left);
                q.add(temp.right);
            }
        }
       return true;
    }
}