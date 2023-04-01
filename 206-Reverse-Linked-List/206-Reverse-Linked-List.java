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
    public ListNode reverseList(ListNode head) {
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