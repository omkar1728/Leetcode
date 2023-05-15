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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return null;
        int count = 1;
        ListNode ptr = head;
        while(ptr.next != null){
            count++;
            ptr = ptr.next;
        }  
        ListNode firstNode = new ListNode(0);
        ListNode lastNode = new ListNode(0);
        int last = count - k + 1;
        ptr = head;
        for(int i = 1; i <= count; i++){
            System.out.println(ptr.val);
            if(i == k) firstNode = ptr;
            if(i == last) lastNode = ptr;
            ptr = ptr.next;
            
        }
        int temp = firstNode.val;
        firstNode.val = lastNode.val;
        lastNode.val = temp ;

        return head;

    }
}