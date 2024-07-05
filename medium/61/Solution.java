
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        var size = getSize(head);
        if (size == 0) {
            return head;
        }
        k = k % size;
        if (k == 0) {
            return head;
        }
        var l = size - k;
        var ptr = head;
        var prev = head;
        while (l > 0) {
            prev = ptr;
            ptr = ptr.next;
            l--;
        }
        prev.next = null;
        var ptr2 = ptr;
        while (ptr2.next != null) {
            ptr2 = ptr2.next;
        }
        ptr2.next = head;
        head = ptr;
        return head;
    }

    int getSize(ListNode head) {
        var s = 0;
        while (head != null) {
            s++;
            head = head.next;
        }
        return s;
    }
}