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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> a = decode(l1);
        ArrayList<Integer> b = decode(l2);
        int p1 = a.size() - 1;
        int p2 = b.size() - 1;
        ListNode ans = new ListNode( ( a.get(p1) + b.get(p2) ) % 10 );        
        int carry = 0;
        if(a.get(p1) + b.get(p2) > 9) carry = 1;
        p1--;
        p2--;
        while(p1 >= 0 && p2 >= 0){
            int sum = a.get(p1) + b.get(p2) + carry;
            if (sum > 9){ 
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode temp = new ListNode(sum%10);
            temp.next = ans;
            ans = temp;
            p1--;
            p2--;
        }
        while(p1 >= 0){
            int sum = a.get(p1) + carry;
            if (sum > 9){ 
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode temp = new ListNode(sum%10);
            temp.next = ans;
            ans = temp;
            p1--;
        }
        while(p2 >= 0){
            int sum = b.get(p2) + carry;
            if (sum > 9){ 
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode temp = new ListNode(sum%10);
            temp.next = ans;
            ans = temp;
            p2--;
        }
        if (carry == 1){
            ListNode temp = new ListNode(1);
            temp.next = ans;
            ans = temp;
        }
        return ans;

    }
    private ArrayList decode(ListNode head){
        ArrayList<Integer> ans = new ArrayList<>();
        while (head != null){
            ans.add(head.val);
            head = head.next;
        }
        return ans;
    }
}