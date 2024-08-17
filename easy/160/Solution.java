/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        var as = getSize(headA);
        var bs = getSize(headB);

        var aptr = headA;
        var bptr = headB;

        if (as < bs) {
            while (bs != as) {
                bptr = bptr.next;
                bs--;
            }
        } else if (bs < as) {
            while (as != bs) {
                aptr = aptr.next;
                as--;
            }
        } 

        while (aptr != null) {
            if (aptr == bptr) {
                return aptr;
            }
            aptr = aptr.next;
            bptr = bptr.next;
        }
        return null;
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