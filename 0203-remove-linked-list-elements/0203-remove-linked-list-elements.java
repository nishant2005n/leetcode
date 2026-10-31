class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
            }

            while(head != null && head.val == val) {
            head = head.next;
            }

            if(head == null) {
            return null;
            }
        
        ListNode prev = head;
        ListNode curr = head.next;

        
        while(curr != null){
            if(curr.val == val){
                ListNode forward = curr.next;
                prev.next = forward;
                curr.next = null; 
                curr = forward;
            }
           
            else{
                prev = curr;
                curr= curr.next;
            }
        }
        return head;
    }
}