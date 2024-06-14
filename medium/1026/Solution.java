
import java.lang.Math;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxAncestorDiff(TreeNode root) {
        var mvk = new MVK();
        traverse(root, new Stack<TreeNode>(), new Stack<TreeNode>(), mvk);
        return Math.abs(mvk.value);
    }

    private void traverse(TreeNode root, Stack<TreeNode> minStack, Stack<TreeNode> maxStack, MVK mvk) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            if (minStack.isEmpty()) {
                minStack.push(root.val > root.left.val ? root.left : root);
            } else if (minStack.peek().val > root.left.val) {
                minStack.push(root.left);
            }
            if (maxStack.isEmpty()) {
                maxStack.push(root.val > root.left.val ? root : root.left);
            } else if (maxStack.peek().val < root.left.val) {
                maxStack.push(root.left);
            }

            var currVal = maxStack.peek().val - minStack.peek().val;
            if (Math.abs(currVal) > Math.abs(mvk.value)) {
                mvk.value = currVal;
            }

            traverse(root.left, minStack, maxStack, mvk);
        }
        if (root.right != null) {
            if (minStack.isEmpty()) {
                minStack.push(root.val > root.right.val ? root.right : root);
            } else if (minStack.peek().val > root.right.val) {
                minStack.push(root.right);
            }
            if (maxStack.isEmpty()) {
                maxStack.push(root.val > root.right.val ? root : root.right);
            } else if (maxStack.peek().val < root.right.val) {
                maxStack.push(root.right);
            }

            var currVal = maxStack.peek().val - minStack.peek().val;
            if (Math.abs(currVal) > Math.abs(mvk.value)) {
                mvk.value = currVal;
            }

            traverse(root.right, minStack, maxStack, mvk);
        }
        if (!minStack.isEmpty() && minStack.peek().equals(root)) {
            minStack.pop();
        }
        if (!maxStack.isEmpty() && maxStack.peek().equals(root)) {
            maxStack.pop();
        }
    }
}

class MVK {
    int value;
}