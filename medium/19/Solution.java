
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1) {
            return null;
        } 
        var m = getSize(head) - n;
        if (m == 0) {
            head = head.next;
        } else {
            var ptr = head;
            m--;
            while (m != 0) {
                ptr = ptr.next;
                m--;
            }
            ptr.next = ptr.next.next;
        }
        return head;
    }

    int getSize(ListNode head) {
        var sz = 0;
        while (head != null) {
            sz++;
            head = head.next;
        }
        return sz;
    }
}