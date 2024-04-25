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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode mainPtr = head;
        ListNode refPtr = head;

        if (head == null || head.next == null) return null;
        int count = 0;
        while (count < n) {
            refPtr = refPtr.next;
            count++;
        }

        int position = 0;
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
            position++;
        }

        ListNode current = head;
        if (current == mainPtr) {
            head = current.next;
        }
        
        for (int i = 0; i < position - 1; ++i) {
            current = current.next;
        }

        current.next = current.next.next;
        return head;
    }
}