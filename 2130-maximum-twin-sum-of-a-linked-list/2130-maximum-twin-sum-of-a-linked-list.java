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
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode twin = reverseList(slow.next);
        ListNode ptr = head;
        int maxSum = -1;
        while(ptr.next != null){
            maxSum = Math.max(maxSum, ptr.val + twin.val);
            ptr = ptr.next;
            twin = twin.next;
        }
        
        
        return maxSum;

    }
    private ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        else if (head.next == null){
            return head;
        }
        else if (head.next.next == null){
            ListNode first = head;
            ListNode second = head.next;
            second.next = first;
            first.next = null;
            return second;
        }
        else{
            ListNode back = head;
            ListNode curr = head.next;
            ListNode front = head.next.next;
            back.next = null;
            while(curr.next != null){
                curr.next = back;

                back = curr;
                curr = front;
                front = front.next;
            }
            curr.next = back;
            return curr;
        }
    }
}