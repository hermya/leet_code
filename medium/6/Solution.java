class Solution {
    public String convert(String s, int numRows) {
        var ans = new StringBuilder("");
        var itr = 0;
        if (numRows >= s.length() || numRows == 1) {
            return s;
        }
        while (itr < numRows) {
            ans.append(s.charAt(itr));
            int x = 1;
            int arm = (numRows - 1)*2;
            if (itr == 0 || itr == numRows - 1) {
                while (itr + x*arm < s.length()) {
                    ans.append(s.charAt(x*arm + itr));
                    x++;
                }
            } else {
                int idx = 0;
                while (idx < s.length()) {
                    idx = arm * x - itr;
                    if (idx < s.length()) {
                        ans.append(s.charAt(idx));
                    } 
                    idx = arm * x + itr;
                    if (idx < s.length()) {
                        ans.append(s.charAt(idx));
                    }
                    x++;
                }
            }
            itr++;
        }
        return ans.toString();
    }
}