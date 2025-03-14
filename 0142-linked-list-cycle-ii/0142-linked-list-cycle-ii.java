public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(temp!=slow){
                    slow=slow.next;
                    temp=temp.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}