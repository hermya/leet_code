import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        var root = new TrieNode('0');
        for (String product : products) {
            var arr = product.toCharArray();
            var temp = root;
            for (char a : arr) {
                if (temp.nodes[a - 'a'] == null) {
                    temp.nodes[a - 'a'] = new TrieNode(a);
                }
                temp = temp.nodes[a - 'a'];
            }
            temp.fullWord = true;
            temp.word = product;
        }
        var ans = new ArrayList<List<String>>();
        var arr = searchWord.toCharArray();
        var temp = root;
        for (char a : arr) {
            var list = new ArrayList<String>();
            if (temp != null) {
                search(temp.nodes[a - 'a'], list);
                temp = temp.nodes[a - 'a'];
            }
            ans.add(list);
        }    
        return ans;
    }

    void search(TrieNode root, ArrayList<String> ans) {
        if (root == null || ans.size() == 3) {
            return;
        }
        if (root.fullWord) {
            ans.add(root.word);
        }
        for (int i = 0; i < 26; i++) {
            if (root.nodes[i] != null) {
                search(root.nodes[i], ans);
            }
        }
    }
}

class TrieNode {
    char self;
    boolean fullWord = false;
    String word = null;
    TrieNode[] nodes;

    TrieNode (char x) {
        self = x;
        nodes = new TrieNode[26];
    }
}