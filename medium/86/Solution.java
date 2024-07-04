
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        var l1 = new ListNode(-201);
        var l2 = new ListNode(-201);
        var ptr = head;
        var ptrl1 = l1;
        var ptrl2 = l2;
        while (ptr != null) {
            if (ptr.val < x) {
                ptrl1.next = new ListNode(ptr.val);
                ptrl1 = ptrl1.next;
            } else {
                ptrl2.next = new ListNode(ptr.val);
                ptrl2 = ptrl2.next;
            }
            ptr = ptr.next;
        }
        if (l1.next == null) {
            return l2.next;
        }
        ptrl1.next = l2.next;
        return l1.next;
    }
}