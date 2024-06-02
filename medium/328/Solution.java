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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head;
        }

        var prev = head;
        var newList = (ListNode)null;
        var newListHead = (ListNode)null;
        var ptr = (ListNode)head;

        while (ptr!=null) {
            prev = ptr;
            ptr = ptr.next;
            if (newList == null) {
                newList = ptr;
                newListHead = newList;
                prev.next = ptr.next;
                if (ptr != null) {
                    ptr = ptr.next;
                }
                newList.next = null;
            }
            else {
                newList.next = ptr;
                newList = newList.next;
                if (ptr != null) {
                    prev.next = ptr.next;
                    ptr = ptr.next;
                }
            }

            //print(head);
            //print(newListHead);
        }

        prev.next = newListHead;
        return head;
    }
    
    void print(ListNode head) {
        while (head!= null) {
            System.out.print("[" + head.val + "]->");
            head = head.next;
        }
        System.out.println("null");

    } 
}