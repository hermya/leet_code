class Trie {
    TrieNode root = null;
    public Trie() {
        root = new TrieNode('0');
    }
    
    public void insert(String word) {
        var arr = word.toCharArray();
        TrieNode cur = root;
        for (char x : arr) {
            if (cur.nodes[x - 'a'] == null) {
                cur.nodes[x - 'a'] = new TrieNode(x);   
            }
            cur = cur.nodes[x - 'a'];
        }
        cur.fullWord = true;
    }
    
    public boolean search(String word) {
        TrieNode cur = root;
        var arr = word.toCharArray();
        for (char x : arr) {
            if (cur.nodes[x - 'a'] == null) {
                return false; 
            }
            cur = cur.nodes[x - 'a'];
        }
        return cur.fullWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        var arr = prefix.toCharArray();
        for (char x : arr) {
            if (cur.nodes[x - 'a'] == null) {
                return false; 
            }
            cur = cur.nodes[x - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

 class TrieNode {
    char self;
    TrieNode[] nodes;
    boolean fullWord = false;
    TrieNode(char x) {
        self = x;
        nodes = new TrieNode[26];
    }
}