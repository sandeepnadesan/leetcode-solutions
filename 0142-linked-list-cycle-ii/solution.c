struct ListNode* detectCycle(struct ListNode* head) {
    struct ListNode* fast = head;
    struct ListNode* slow = head;
    int i = 0;
    while (fast != NULL && fast->next != NULL) {
        fast = fast->next->next;
        slow = slow->next;
        if (slow == fast)
            break;
    }
    if (fast == NULL || fast->next == NULL)
        return NULL;
    while (head != slow) {
        head = head->next;
        slow = slow->next;
    }
    return head;
    
}
