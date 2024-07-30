import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        var rl = false;
        var dq = new LinkedList<TreeNode>();
        var ans = new ArrayList<List<Integer>>();

        dq.addLast(root);

        while (!dq.isEmpty()) {
            var temp = new LinkedList<TreeNode>();
            var level = new ArrayList<Integer>();
            while (!dq.isEmpty()) {
                var item = dq.pollFirst();
                level.add(item.val);
                if (rl) {
                    if (item.right != null) {
                        temp.addFirst(item.right);
                    } 
                    if (item.left != null){
                        temp.addFirst(item.left);
                    }
                } else {
                    if (item.left != null){
                        temp.addFirst(item.left);
                    }
                    if (item.right != null) {
                        temp.addFirst(item.right);
                    } 
                }
            }
            rl = !rl;
            dq = temp;
            ans.add(level);
        }
        return ans;
    }
}