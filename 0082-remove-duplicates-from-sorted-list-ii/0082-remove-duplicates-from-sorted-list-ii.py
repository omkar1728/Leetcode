# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        stack = [ListNode(-19999)]
        while head:
            if head.val == stack[-1].val:
                print("pop")
                node = stack.pop()
                while head and head.val == node.val:
                    head = head.next
            if head == None:
                break
            stack.append(head)
            head = head.next
        stack[-1].next =  None
        if len(stack) == 1:
            return None
        head = stack[1]
        for i in stack[2:]:
            head.next = i
            head = head.next
        return stack[1]
            
            