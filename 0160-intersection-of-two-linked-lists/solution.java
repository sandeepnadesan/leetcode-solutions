public class Solution {
    Set<ListNode> s=new HashSet<>();
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;
        while(t1!=null){
            s.add(t1);
            t1=t1.next;
        }
        while(t2!=null){
            if(s.contains(t2)) return t2;
            t2=t2.next;
        }
        return null;
        
    }
}
