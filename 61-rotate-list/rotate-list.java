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
    public ListNode rotateRight(ListNode head, int k) {
        int count=0;
        ListNode prev=null;
        ListNode tail =head;
        ListNode temp =head;
        if(head==null||head.next==null){
            return head;
        }
        while(tail.next!=null){
            count++;
            tail=tail.next;
        }
        count++;
        k=k%count;
        if(k==0){
            return head;
        }
        count=count-k;
        temp=head;
        for(int i=0;i<count-1;i++){
            prev=temp;
            temp=temp.next;
        }
        tail.next = head;
        head = temp.next;
        temp.next = null;
        return head;
}
}