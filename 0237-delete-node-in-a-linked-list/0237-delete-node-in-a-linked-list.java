/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode head; 

    public void deleteNode(ListNode node) {
        ListNode node_next = node.next;
        int value = node_next.val;
        node.val = value;
        node.next = node_next.next;
        node_next.next = null;
    }
}