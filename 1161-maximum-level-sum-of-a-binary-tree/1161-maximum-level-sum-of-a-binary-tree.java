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
    HashMap<Integer,Integer> map = new HashMap<>();
    public int maxLevelSum(TreeNode root) {
        t(root, 1);
        int ans = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
    private void t(TreeNode root, int level){
        if(root == null) return;
        if(map.containsKey(level)){
            map.put(level, map.get(level) + root.val);
        } else {
            map.put(level, root.val);
        }        
        t(root.left, level+1);
        t(root.right, level+1);

    }
}