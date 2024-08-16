class WordDictionary {
    TrieNode head;
    public WordDictionary() {
        head = new TrieNode();
    }
    
    public void addWord(String word) {
        var warr = word.toCharArray();
        var temp = head;
        for (int i = 0; i < warr.length; i++) {
            if (temp.children[warr[i] - 'a'] == null) {
                temp.children[warr[i] - 'a'] = new TrieNode();
            }
            temp = temp.children[warr[i] - 'a'];
        }
        temp.isEnd = true;
        temp.word = word;
    }
    
    public boolean search(String word) {
        return search(word.toCharArray(), 0, head);
    }

    boolean search(char[] warr, int i, TrieNode node) {
        if (node == null) {
            return false;
        }
        
        if (i == warr.length) {
            return node.isEnd;
        }

        if (warr[i] == '.') {
            var op = false;
            for (int j = 0; j < 26; j++) {
                op = op | search(warr, i + 1, node.children[j]);
                if (op) {
                    return true;
                }
            }
            return false;
        } else {
            return search(warr, i + 1, node.children[warr[i] - 'a']);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

class TrieNode {
    boolean isEnd;
    TrieNode[] children = new TrieNode[26];
    String word;
}