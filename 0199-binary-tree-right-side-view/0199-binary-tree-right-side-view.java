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
    List<Integer> ans = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return ans;
        List<CustomNode> order = new ArrayList<>();
        order.add(new CustomNode(root, 0));
        int ptr = 0;
        while(ptr  < order.size()){
            CustomNode node = order.get(ptr);
            if(node.node == null) break;
            if(node.node.left != null) order.add(new CustomNode(node.node.left, node.depth + 1));
            if(node.node.right != null) order.add(new CustomNode(node.node.right, node.depth + 1));
            ptr++;            
        }
        int curr = order.get(order.size() - 1).depth + 1;
        for(int i =  order.size() - 1; i >= 0; i--){
            if(order.get(i).depth < curr){
                curr--;
                ans.add(order.get(i).node.val);
            }
    
        }
        Collections.reverse(ans);

        return ans;
    }
    
}
class CustomNode{
    TreeNode node;
    int depth;
    public CustomNode(TreeNode node, int depth) {
        this.node = node;
        this.depth = depth;
    }
}