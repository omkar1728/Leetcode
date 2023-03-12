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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 0) return lists[0];

        for(int i = 1; i < lists.length; i++){
            lists[i] = merge(lists[i], lists[i-1]);
        }
        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null) System.out.println(lists[i].val);
        }     
        return lists[lists.length - 1];
    }

    private ListNode merge(ListNode h1, ListNode h2){
        ListNode temp = new ListNode();
        ListNode head = temp;
        while(h1 != null && h2 != null){
            if(h1.val < h2.val){
                temp.next = h1;
                h1 = h1.next; 
            } else {
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }
        if(h1 == null){
            temp.next = h2;
        } 
        if(h2 == null){
            temp.next = h1;
        }
        return head.next;

    }
}