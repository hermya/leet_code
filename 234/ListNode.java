
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode oneStep = head;
        ListNode twoStep = head;
        ListNode prevToOneStep = head;
        int tsc = 2;
        if (head.next == null) {
            return true;
        }

        twoStep = twoStep.next;
        
        while (oneStep.next != null && twoStep.next != null) {
            prevToOneStep = oneStep;
            oneStep = oneStep.next;
            twoStep = twoStep.next;
            tsc++;
            if (twoStep.next != null) {
                twoStep = twoStep.next;
                tsc++;
            }
        }
        if (tsc == 2) {
            return oneStep.val == twoStep.val;
        }
        if (tsc == 3) {
            return head.val == twoStep.val;
        }
        if (tsc == 4) {
            return head.val == twoStep.val && oneStep.val == oneStep.next.val;
        }
        if (tsc % 2 == 1) {
            // odd palindrome
            prevToOneStep.next = null;   
        }
        ListNode lastNode = oneStep.next;
        ListNode newList = oneStep.next.next;
        lastNode.next = null;
        ListNode holder = lastNode;
        oneStep.next = null;
        while (newList.next != null){
            ListNode temp = newList;
            newList = newList.next;
            temp.next = holder;
            holder = temp; 
        }
        newList.next = holder;
        while (head != null && newList != null) {
            if (head.val != newList.val) {
                return false;
            }
            head = head.next;
            newList = newList.next;
        }
        return true;
    }
}