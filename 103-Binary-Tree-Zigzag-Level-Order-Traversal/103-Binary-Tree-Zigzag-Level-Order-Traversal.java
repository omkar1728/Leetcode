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
    HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zig = new ArrayList<>();
        if(root == null) return zig;
        dfs(root, 0);
        for(Map.Entry<Integer,ArrayList<Integer>> mapElement : map.entrySet()){
            if(mapElement.getKey()%2 == 0){
                zig.add(mapElement.getValue());
            } else {
                Collections.reverse(mapElement.getValue());
                zig.add(mapElement.getValue());
            }
        }
        return zig;
    }
    private void dfs(TreeNode root, int level){
        if (root == null) return;
        if(map.containsKey(level)){
            map.get(level).add(root.val);
        } else {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(root.val);
            map.put(level, temp );
        }
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
