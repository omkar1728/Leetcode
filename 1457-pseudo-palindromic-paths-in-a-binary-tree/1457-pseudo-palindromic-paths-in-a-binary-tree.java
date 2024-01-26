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
    int ans = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        if(root.left == null && root.right == null) return 1;

        int[] cache = new int[10];
        t(root,cache);
        return ans;
    }

    private void t(TreeNode root, int[] cache){
        if(root == null ) return;
        cache[root.val] += 1;
        if(root.left == null && root.right == null){
            if(isValid(cache)) ans += 1;
            return;
        }
        t(root.left, Arrays.copyOf(cache, 10));
        t(root.right, Arrays.copyOf(cache, 10));
        
    }
    private boolean isValid(int[] cache){
        int flag = 0;
        for (int i = 0; i < 10; i++) {
            if(cache[i]%2 != 0) flag++;
            if(flag == 2) return false;
        }
        return true;
    }
    
}