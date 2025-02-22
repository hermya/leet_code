import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class FindElements {
    TreeNode root = null;
    public FindElements(TreeNode root) {
        this.root = root;
        traverse(this.root, 0);
    }

    void traverse(TreeNode root, int value) {
        if (root == null) {
            return;
        }

        root.val = value;

        traverse(root.left, 2 * value + 1);
        traverse(root.right, 2 * value + 2);
    }
    
    public boolean find(int target) {
        Stack<Integer> traversal = new Stack<Integer>();
        int ele = target;
        while (target > 0) {
            traversal.add(target);
            target = (target - 1)/2;
        }

        TreeNode temp = this.root;
        int curr = 0;
        while (temp != null) {
            if (temp.val == ele) {
                return true;
            }
            if (traversal.peek() == 2 * curr + 1) {
                temp = temp.left;
                curr = 2 * curr + 1;
            } else if (traversal.peek() == 2 * curr + 2) {
                temp = temp.right;
                curr = 2 * curr + 2;
            } else {
                return false;
            }
            traversal.pop();
        }
        return false;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */