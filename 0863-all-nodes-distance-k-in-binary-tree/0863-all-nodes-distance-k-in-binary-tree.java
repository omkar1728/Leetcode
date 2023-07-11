/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode,TreeNode> map = new HashMap<>();
    List<Integer> ans = new ArrayList<>();
    HashSet<TreeNode> set = new HashSet<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        t(root);
        n(target,k);
        return ans;
    }
    private void n(TreeNode target, int k){
        if(target == null || k < 0) return;
        if(set.contains(target)) return;
        set.add(target);
        if(k == 0){
            ans.add(target.val);
            return;
        }
        if(target.left != null){
            n(target.left, k - 1);
        }
        if(target.right != null){
            n(target.right, k - 1);        
        }
        if(map.containsKey(target)){
            n(map.get(target), k - 1);
        }
    }
    private void t(TreeNode root){
        if(root == null) return;
        if(root.left != null){
            map.put(root.left, root);
            t(root.left);
        }
        if(root.right != null){
            map.put(root.right, root);
            t(root.right);
        }
    }

}