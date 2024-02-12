import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        var string = new StringBuilder("");
        traverse(root, string);
        return string.toString();
    }

    private void traverse(TreeNode root, StringBuilder data) {
        if (root == null) {
            data.append(",|");
            return;
        }
        if (data.toString().equals("")) {
            data.append(root.val);
        } else {
            data.append("," + root.val);
        }
        traverse(root.left, data);
        traverse(root.right, data);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> eles = new ArrayList<>(Arrays.asList(data.split(",")));
        return build(eles);
    }

    private TreeNode build(List<String> eles) {
        if (eles.get(0).equals("|") || eles.get(0).equals("")) {
            eles.remove(0);
            return null;
        }
        var root = new TreeNode(Integer.parseInt(eles.get(0)));
        eles.remove(0);
        root.left = build(eles);
        root.right = build(eles);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;