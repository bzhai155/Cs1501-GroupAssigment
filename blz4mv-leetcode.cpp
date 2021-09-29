/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode * head = new ListNode();
        ListNode * current = head;
        int extra = 0;
        while(l1 != NULL || l2 != NULL){
            int lv1 = 0;
            int lv2 = 0;
            if(l1 != NULL){
                lv1 = l1->val;
            }
            if(l2 != NULL){
                lv2 = l2->val;
            }
            int sum = lv1 + lv2 + extra;
            extra = sum / 10;
            current->next = new ListNode(sum % 10);
            current = current->next;
            if (l1 != NULL){
                l1 = l1->next;
            }
            if (l2 != NULL){
                l2 = l2->next;
            }
        }
    if (extra != 0) {
        current->next = new ListNode(extra);
    }
    return head->next;
    }
};