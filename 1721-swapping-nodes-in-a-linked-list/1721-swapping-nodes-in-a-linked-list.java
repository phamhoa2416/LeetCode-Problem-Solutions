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
        ArrayList<Integer> nums = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            nums.add(current.val);
            current = current.next;
        }

        int temp = nums.get(k - 1);
        nums.set(k - 1, nums.get(nums.size() - k));
        nums.set(nums.size() - k, temp);

        current = head;
        for (int i = 0; i < nums.size(); ++i) {
            current.val = nums.get(i);
            current = current.next;
        }

        return head;
    }
}