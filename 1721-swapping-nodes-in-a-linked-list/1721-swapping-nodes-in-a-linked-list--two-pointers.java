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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        int temp = k;
        while (k-- > 0) {
            fast = fast.next;
        } 

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        fast = head;
        while (--temp > 0) {
            fast = fast.next;
        } 

        temp = fast.val;
        fast.val = slow.val;
        slow.val = temp;
        
        return head;
    }
}