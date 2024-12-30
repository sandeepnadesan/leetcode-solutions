/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* prev=NULL;
    struct ListNode* cur=head;
    struct ListNode* nn=NULL;
    
    // cur=head->next;
    // head=head->next;
    // prev->next=NULL;
    // prev=head;
    while(cur!=NULL){
        nn=cur->next;
        cur->next=prev;
        prev=cur;
        cur=nn;
    }
    return prev;

    
}
