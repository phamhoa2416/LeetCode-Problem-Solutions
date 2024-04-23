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
    ListNode* middleNode(ListNode* head) {
        vector<int> v;

        ListNode* current = head;
        while (current != nullptr) {
            v.push_back(current->val);
            current = current->next;
        }

        ListNode* middleNode = head;
        for (int i = 0; i < v.size()/2; ++i) {
            middleNode = middleNode->next;
        }

        return middleNode;
    }
};