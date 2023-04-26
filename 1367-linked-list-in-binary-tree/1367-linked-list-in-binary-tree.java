/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.val == head.val){
                if(contains(node,head)) return true;
            }
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
        return false;
    }
    private boolean contains(TreeNode root, ListNode head){
        if(head == null) return true;
        if(root == null && head != null) return false;
        if(root.val != head.val){
            return false;
        }
        return contains(root.left,head.next) || contains(root.right,head.next);
    }
}