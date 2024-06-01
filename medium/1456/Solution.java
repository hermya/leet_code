import java.util.LinkedList;

class Solution {
    public int maxVowels(String s, int k) {
        var queue = new LinkedList<Integer>();
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                queue.addLast(i);
            }
        }
        var max = queue.size();
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                queue.addLast(i);
            }
            if (!queue.isEmpty() && queue.peekFirst() == i - k) {
                queue.pollFirst();
            }
            max = Math.max(max, queue.size());
        }
        return max;
    }

    boolean isVowel(char a) {
        switch(a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            return true;
            default:
            return false;
        }
    }
}