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
        ListNode current = head;

        if (head == null || head.next == null) return null;

        int position = 0;
        while (current != null && current.next != null) {
            current = current.next.next;
            position++;
        }

        current = head;
        while (--position > 0) {
            current = current.next;
        }
        current.next = current.next.next;

        return head;
    }
}