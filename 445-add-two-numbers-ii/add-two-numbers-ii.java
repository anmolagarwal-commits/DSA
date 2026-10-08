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
    ListNode reverse(ListNode curr,ListNode prev){
        if(curr==null){
            return prev;
        }
        ListNode front=curr.next;
        curr.next=prev;
        return reverse(front,curr);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1,null);
        l2 = reverse(l2,null);
        int carry = 0;
        ListNode dummy=new ListNode(0);
        ListNode curr =dummy;
        while (l1!=null|| l2!= null||carry!=0) {
            int sum=carry;
            if(l1!=null) {
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null) {
                sum=sum+ l2.val;
                l2=l2.next;
            }
            curr.next =new ListNode(sum % 10);
            curr =curr.next;
            carry =sum/10;
        }
        return reverse(dummy.next,null);

    }
}


