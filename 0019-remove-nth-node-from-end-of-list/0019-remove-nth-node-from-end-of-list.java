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

        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        refPtr = head;
        if (head == mainPtr) {
            return head.next;
        }
        
        while (refPtr.next != null && refPtr.next != mainPtr) {
            refPtr = refPtr.next;
        }
        
        refPtr.next = refPtr.next.next;
        return head;
    }
}