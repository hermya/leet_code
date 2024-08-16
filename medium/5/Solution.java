class Solution {
    public String longestPalindrome(String s) {
        var pdp = new boolean[s.length()][s.length()];
        var sarr = s.toCharArray();

        var ans = new int[]{0, 1};
        for (int i = 2; i <= s.length(); i++) {
            for (int j = 0; j < s.length() && j + i <= s.length(); j++) {
                pdp[j][j + i - 1] = isPal(sarr, j, j + i - 1, pdp);
                if (pdp[j][j + i - 1]) {
                    if (i > ans[1] - ans[0]) {
                        ans[0] = j;
                        ans[1] = j + i;
                    }
                }
            }
        }

        return s.substring(ans[0], ans[1]);
    }

    boolean isPal(char[] sarr, int start, int end, boolean[][] pdp) {
        if (start >= end - 2) {
            return sarr[start] == sarr[end];
        }
        else return sarr[start] == sarr[end] && pdp[start + 1][end - 1];
    }
}