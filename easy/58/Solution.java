class Solution {
    public int lengthOfLastWord(String s) {
        var arr = s.toCharArray();
        int j = s.length() - 1;
        while (!Character.isLetterOrDigit(arr[j]) && j >= 0) {
            j--;
        }
        if (j == - 1) {
            return 0;
        }
        int t = j;
        while (j >= 0 && Character.isLetterOrDigit(arr[j])) {
            j--;
        }
        return t - j;
    }
}