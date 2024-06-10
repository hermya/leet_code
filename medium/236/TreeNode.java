import java.util.LinkedList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        var pStack = new LinkedList<TreeNode>();
        var qStack = new LinkedList<TreeNode>();
        traverse(root, p, q, pStack, qStack, new boolean[1], new boolean[1]);
        var smallerList = pStack.size() < qStack.size() ? pStack : qStack;
        var largerList = pStack.size() >= qStack.size() ? pStack : qStack;
        var ans = (TreeNode) null;
        while (largerList.size() > smallerList.size()) {
            largerList.pollLast();
        }
        while (!smallerList.isEmpty()) {
            if (smallerList.peekLast() == largerList.peekLast()) {
                ans = smallerList.peekLast();
                break;
            }
            smallerList.pollLast();
            largerList.pollLast();
        }
        return ans;
    }

    void traverse(TreeNode root, TreeNode p, TreeNode q, 
        LinkedList<TreeNode> pStack, LinkedList<TreeNode> qStack, 
        boolean[] pFound, boolean[] qFound) {
        if (root == null) {
            return;
        }

        if (!pFound[0]) {
            pStack.addLast(root);
            pFound[0] = root.val == p.val;
        }

        if (!qFound[0]) {
            qStack.addLast(root);
            qFound[0] = root.val == q.val;
        }
        
        traverse(root.left, p, q, pStack, qStack, pFound, qFound);
        traverse(root.right, p, q, pStack, qStack, pFound, qFound);

        if (!pFound[0]) {
            pStack.pollLast();
        } 
        if (!qFound[0]) {
            qStack.pollLast();
        } 
    }
}