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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            var ptr = head.next;
            head.next.next = head;
            head.next = null;
            return ptr;
        }
        var prev = head;
        var mid = head.next;
        var ptr = head.next.next;
        prev.next = null;
        while (mid != null) {
            mid.next = prev;
            prev = mid;
            mid = ptr;
            ptr = ptr != null ? ptr.next : null;
        }
        return prev;
    }
}