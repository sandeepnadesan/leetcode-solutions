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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int len=0;

        while(temp!=null){
            temp=temp.next;
            len++;        
        }
        int mid=len/2;
        System.out.println(mid);
        ListNode node = head;
        int pos=1;
        while(pos<mid){
            node=node.next;
            pos++;
        }
        if(len==mid || len<2){
            head=head.next;
        }
        else{
            node.next=node.next.next;
        }

        return head;

    }
}
