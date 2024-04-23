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
import java.util.Vector;

class Solution {
    public ListNode middleNode(ListNode head) {
        Vector<Integer> v = new Vector<>();

        ListNode current = head;
        while (current != null) {
            v.add(current.val);
            current = current.next;
        }

        ListNode middleNode = head;
        for (int i = 0; i < v.size()/2; ++i) {
            middleNode = middleNode.next;
        }
        return middleNode;
    }
}