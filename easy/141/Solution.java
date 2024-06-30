
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        var c1 = head;
        var c2 = head;
        if (head == null) {
            return false;
        }
        while (c1 != null && c2 != null) {
            c1 = c1.next;
            c2 = c2.next;
            if (c2 == null) {
                return false;
            } else {
                c2 = c2.next;
            }
            if (c1 == c2) {
                return true;
            }
        }
        return false;
    }
}