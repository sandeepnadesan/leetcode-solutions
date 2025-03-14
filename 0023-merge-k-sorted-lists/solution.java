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
    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode curr = null;
        ListNode ans = null;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (ans == null) {
                    ans = list1;
                    curr = list1;
                    list1 = list1.next;
                } else {
                    curr.next = list1;
                    curr = list1;
                    list1 = list1.next;
                }
            } else {
                if (ans == null) {
                    ans = list2;
                    curr = list2;
                    list2 = list2.next;
                } else {
                    curr.next = list2;
                    curr = list2;
                    list2 = list2.next;
                }
            }
        }
        if (list1 != null) {
            curr.next = list1;
        }
        if (list2 != null) {
            curr.next = list2;
        }
        return ans;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n= lists.length;
        ListNode first = null;
        for(int i=0;i<n;i++){
            first=merge(first,lists[i]);
        }
        return first;
        
    }
}
