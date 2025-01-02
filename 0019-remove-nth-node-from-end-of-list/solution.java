/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode node = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        int rem = len - n;
        // System.out.println(rem);
        // if (rem == 0 && len == 1) {
        //     head = null;
        //     return head;
        // }
        // temp = head;
        int c = 1;
        while (c < rem) {
            node = node.next;
            c++;
        }
        if(len==n){
            head=head.next;
        }
        else{
        node.next = node.next.next;
        }
        return head;
    }
}
