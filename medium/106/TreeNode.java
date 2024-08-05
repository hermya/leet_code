import java.util.HashMap;
import java.util.Map;


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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // inorder    9 3 15 20 7
        // postorder  9 15 7 20 3
        // root = 3
        // leftside of root in inorder travesal gives size of left size

        var pos = new HashMap<Integer, Integer>();

        int i = 0;
        for (int x : inorder) {
            pos.put(x, i);
            i++;
        }

        return createTree(inorder, postorder, pos, 0, pos.size() - 1, 0, pos.size() - 1);
    }

    TreeNode createTree(int[] inorder, int[] postorder, 
                        Map<Integer, Integer> pos, 
                        int pStart, int pEnd, 
                        int iStart, int iEnd) {
        if (pStart > pEnd) {
            return null;
        }
        var node = new TreeNode(postorder[pEnd]);
        var lLen = pos.get(postorder[pEnd]) - iStart - 1;
        var rLen = iEnd - pos.get(postorder[pEnd]) - 1;

        node.left = createTree(inorder, postorder, 
                                pos, 
                                pStart, pStart + lLen, 
                                iStart, iStart + lLen);
        node.right = createTree(inorder, postorder, 
                                pos, 
                                pEnd - rLen - 1, pEnd - 1,
                                iEnd - rLen, iEnd);

        return node;
    }
}