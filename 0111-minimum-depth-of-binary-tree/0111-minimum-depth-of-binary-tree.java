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
    int ans = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return t(root);
        
    }
    private int t(TreeNode root){

        HashMap<Integer,ArrayList> map = new HashMap<>();
        ArrayList<TreeNode> temp = new ArrayList<>();
        temp.add(root);
        map.put(1,temp);
        int depth = 1; 
        while(map.get(depth).size() != 0){
            ArrayList<TreeNode> level = map.get(depth);
            ArrayList<TreeNode> next = new ArrayList<>();
            map.put(depth + 1, next);

            for(int i = 0; i < level.size(); i++){
                if(level.get(i).left == null && level.get(i).right == null) return depth;
                if(level.get(i).left != null) map.get(depth + 1).add(level.get(i).left);
                if(level.get(i).right != null) map.get(depth + 1).add(level.get(i).right);

            }
            depth++;
        }
        return depth;


    }
}