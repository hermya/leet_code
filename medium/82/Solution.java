
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        var ptr = head;
        var ptr1 = head.next;
        var pmbu = head.val != head.next.val;
        var nl = new ListNode();
        var nlptr = nl;
        while (ptr1 != null) {
            if (ptr.val != ptr1.val && pmbu) {
                nl.next = new ListNode();
                nl.next.val = ptr.val;
                nl = nl.next;
            } else if (ptr.val != ptr1.val && !pmbu){
                pmbu = true;
            } else if (ptr.val == ptr1.val) {
                pmbu = false;
            }
            ptr = ptr1;
            ptr1 = ptr1.next;
        }

        if (pmbu) {
            nl.next = new ListNode();
            nl.next.val = ptr.val;
            nl = nl.next;
        }
        return nlptr.next;
    }
}