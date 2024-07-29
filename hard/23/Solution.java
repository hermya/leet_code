
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        var hp = new ListNode();
        var h = hp;
        var ptrs = new ListNode[lists.length];
        var s = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                ptrs[s] = lists[i];
                s++;
            }
        } 
        var min = 0;
        do {
            min = -1;
            for (int i = 0; i < s; i++) {
                if (min == -1 && ptrs[i] != null) {
                    min = i;
                } else if (ptrs[i] != null){
                    if (ptrs[min].val > ptrs[i].val) {
                        min = i;
                    }
                }
            }
            if (min != -1) {
                h.next = ptrs[min];
                h = h.next;
                ptrs[min] = ptrs[min].next;
            }
        } while (min != -1);
        return hp.next;
    }
}