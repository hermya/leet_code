
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode deleteMiddle(ListNode head) {
        var dRunner = head;
        var runner = head;

        if (head.next == null) {
            return null;
        }

        if (head.next.next == null) {
            head.next = null;
            return head;
        }

        var prev = head;
        while (dRunner.next != null) {
            prev = runner;
            runner = runner.next;
            dRunner = dRunner.next;
            if (dRunner.next != null){
                dRunner = dRunner.next;
            } 
        }
        prev.next = runner.next;
        return head;
    }
}