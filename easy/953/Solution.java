class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderArr = new int[26];
        for (int i = 0; i < order.length(); i++){
            orderArr[order.charAt(i) - 'a'] = i; 
        } 
        for (int i = 0; i < words.length - 1; i++) {
            if (!isSortedLexo(words[i], words[i+1], orderArr)){
                return false;
            }
        }
        return true;
    }
    boolean isSortedLexo(String word1, String word2, int[] orderArr){
        var minLength = Math.min(word1.length(), word2.length());
        for (int i = 0; i < minLength; i++){
            char char1 = word1.charAt(i);
            char char2 = word2.charAt(i);
            if (orderArr[char1 - 'a'] > orderArr[char2 - 'a']) {
                return false;
            } else if (orderArr[char1 - 'a'] < orderArr[char2 - 'a']) {
                return true;
            }
        }
        if (word1.length() > word2.length()) {
            System.out.println("word size");
            return false;
        }
        return true;
    }
}