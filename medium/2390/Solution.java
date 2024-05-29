class Solution {
    public String removeStars(String s) {
        var ans = s.toCharArray();
        var pos = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == '*') {
                pos--;
            } else {
                ans[pos] = ans[i];
                pos++;
            }
        }
        return String.valueOf(ans).substring(0, pos);
    }
}