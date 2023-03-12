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
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        while(head != null){
            nums.add(head.val);
            head = head.next;
        }
        return gen(nums,0,nums.size()-1);
    }
    private TreeNode gen(ArrayList<Integer> nums, int left, int right){
        if (left > right) return null;
        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = gen(nums, left, mid -1 );
        root.right = gen(nums, mid + 1, right);
        return root;
    }
}