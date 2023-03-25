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
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> nodes = new ArrayList<>();
        while(head != null){
            nodes.add(head.val);
            head = head.next;
        }
        System.out.println(nodes);
        int currMax = nodes.get(nodes.size() - 1);
        for(int i = nodes.size() - 2; i >= 0; i--){
            if(nodes.get(i) > currMax){
                currMax = nodes.get(i);
            }
            if(nodes.get(i) < currMax){
                nodes.set(i, null);
            }
        }
        ListNode start = new ListNode();
        ListNode curr = start;
        for(int i = 0; i < nodes.size(); i++){
            if(nodes.get(i) != null){
                curr.val = nodes.get(i);
                curr.next = new ListNode();
                curr = curr.next;
            }
        }
        curr  = start;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return start;
    }
}