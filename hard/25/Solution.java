
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head.next == null || k == 1) {
            return head;
        }

        var ptr = head;
        // get first head by getting first k groups;
        var n = k - 1;
        while (n > 0 && ptr != null) {
            n--;
            ptr = ptr.next;
        }

        if (ptr == null) {
            return head;
        }
        
        var nListH = ptr.next; // head of next list;
        var nHead = ptr;
        ptr.next = null; // detached orignal list from next;
        var nend = reverse(head); // got the end of next list;
        
        //println(ptr);
        //println(nListH);

        ptr = nListH;
        while (ptr != null) {
            n = k - 1;
            while (n > 0 && ptr != null) {
                n--;
                ptr = ptr.next;
            }
            if (ptr == null) {
                nend.next = nListH;
                return nHead;
            } else {
                var temp = ptr.next; // detached orignal list from next;
                ptr.next = null;
                nend.next = ptr;
                nend = reverse(nListH); // got the end of next list;
                //println(ptr);
                ptr = temp;
                nListH = temp;
            }
        }   

        return nHead;
    }

    ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        var node = reverse(head.next);
        node.next = head;
        head.next = null;
        return head;
    }

    void println(ListNode head) {
        if (head == null) {
            System.out.println("head = null");
        } else {
            System.out.print(head.val);
            while (head.next != null) {
                head = head.next;
                System.out.print(" => " + head.val);
            }
            System.out.println();
        }
    }
}