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

    ListNode merge2Lists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode sentinel = new ListNode(-1), ptr = sentinel;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                ptr.next = l1;
                l1 = l1.next;
            } else {
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }
        if(l1 != null)
            ptr.next = l1;
        else if(l2 != null)
            ptr.next = l2;
        return sentinel.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null;
        int end = lists.length-1;

        while(end != 0) {
            int l = 0, r = end;
            while(l < r) {
                lists[l] = merge2Lists(lists[l], lists[r]);
                l++;
                r--;
            }
            end = r;
        }

        return lists[0];
    }
}
