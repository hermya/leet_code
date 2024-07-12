
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

class BSTIterator {

    LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
    public BSTIterator(TreeNode root) {
        var ptr = root;
        while (ptr != null) {
            stack.addLast(ptr);
            ptr = ptr.left;
        }
    }
    
    public int next() {
        var ele = stack.pollLast();
        if (ele.right != null) {
            stack.addLast(ele.right);
        } 
        var temp = ele.right;
        if (temp != null) {
            temp = temp.left;
            while (temp != null) {
                stack.addLast(temp);
                temp = temp.left;
            }
        }
        
        return ele.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */