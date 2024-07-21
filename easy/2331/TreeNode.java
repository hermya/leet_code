
public class TreeNode {
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
    byte[] stack = new byte[1001];
    public boolean evaluateTree(TreeNode root) {
        evaluate(root, this.stack, new int[]{-1});
        return stack[0] == 0 ? false : true;
    }

    void evaluate (TreeNode root, byte[] stack, int[] top) {
        top[0]++;
        stack[top[0]] = (byte) root.val;
        if (root.left == null && root.right == null) {
            //printStack(stack, top[0]);
        }
        if (root.left != null) {
            //printStack(stack, top[0]);
            evaluate(root.left, stack, top);
        }
        if (root.right != null) {
            //printStack(stack, top[0]); 
            evaluate(root.right, stack, top);
        }
        if (top[0] > 1 && stack[top[0] - 2] > 1 && stack[top[0] - 1] < 2 && stack[top[0]] < 2) {
            switch (stack[top[0]-2]) {
                case 2: 
                    stack[top[0]-2] = (byte) Math.max(stack[top[0] - 1], stack[top[0]]); 
                    top[0] -= 2;
                    break;
                case 3: 
                    stack[top[0]-2] = (byte) Math.min(stack[top[0] - 1], stack[top[0]]);
                    top[0] -= 2;
                    break;
                default: break;
            }
            //printStack(stack, top[0]);
        }
    }

    void printStack(byte[] stack, int top) {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + ", ");
        }
        System.out.println();
    }
}