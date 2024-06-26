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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null || left == right) {
            return head;
        }
        var pos = 1;
        var h = head;
        var ptr = head;
        var subList = ptr;
        var prev = head;
        if (left != 1) {
            while (ptr != null && pos != left) {
                pos++;
                prev = ptr;
                ptr = ptr.next;
            }
            h = prev;
            subList = ptr;
            prev.next = null;
        }
        
        var nextList = (ListNode)null;

        while (ptr != null && pos != right) {
            pos++;
            prev = ptr;
            ptr = ptr.next;
        }

        var s = ptr;
        if (s == null) {
            nextList = null;
        } else {
            nextList = ptr.next;
            s.next = null;
        }

        // reverseList

        var fHead = new ListNode[1];
        var last = reverse(subList, fHead);

        h.next = fHead[0];
        last.next = nextList;
        return left == 1 ? fHead[0] : head;
    }

    ListNode reverse(ListNode x, ListNode[] fHead) {
        if (x.next == null) {
            fHead[0] = x;
            return x;
        }
        var val = reverse(x.next, fHead);
        val.next = x;
        x.next = null;
        return x;
    }
}