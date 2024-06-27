import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        } 
        if (head.next == null) {
            if (head.random == null) {
                return new Node(head.val);
            } else {
                var x = new Node(head.val);
                x.random = x;
                return x;
            }
        }
        var map = new HashMap<Node, Node>();
        var ans = (Node) new Node(head.val);
        var ptr1 = ans;
        var ptr2 = head;
        map.put(ptr2, ptr1);
        ptr2 = ptr2.next;
        while (ptr2 != null) {
            ptr1.next = new Node(ptr2.val);
            ptr1 = ptr1.next;
            map.put(ptr2, ptr1);
            ptr2 = ptr2.next;
        }
        ptr1 = ans;
        ptr2 = head;
        while (ptr2 != null) {
            if (ptr2.random == null) {
                ptr1.random = null;
            } else {
                ptr1.random = map.get(ptr2.random);
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ans;
    }
}