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
    public int getDecimalValue(ListNode head) {
        int multiplier = 1;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        for(int i = list.size() - 1; i >= 0; i--){
            sum += list.get(i)*multiplier;
            multiplier *= 2;
        }
        return sum;
    }
}