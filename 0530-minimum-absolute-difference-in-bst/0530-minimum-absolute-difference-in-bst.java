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
    int min = Integer.MAX_VALUE;
    ArrayList<Integer> arr = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        t(root);
        for(int i = 1; i < arr.size(); i++){
            min = Math.min(min, Math.abs(arr.get(i) - arr.get(i-1)));
        }
        return min;
    }
    private void t(TreeNode root){
        if(root == null) return;
        t(root.left);
        arr.add(root.val);
        t(root.right);
    }
}