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
    public int pairSum(ListNode head) {
        int[] max = new int[1];
        var last = recursiveSum(head, head.next, max);
        max[0] = Math.max(max[0], head.val + last.val);
        return max[0];
    }

    ListNode recursiveSum(ListNode oneStep, ListNode twoStep, int[] max) {
        if (twoStep.next != null) {
            var node = recursiveSum(oneStep.next, twoStep.next.next, max);
            max[0] = Math.max(max[0], node.val + oneStep.next.val);
            return node.next;
        } else {
            return oneStep.next;
        }
    }
}