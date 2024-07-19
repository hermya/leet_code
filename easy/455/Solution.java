import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        var i = 0;
        var j = 0;
        var a = 0;
        while(i < g.length) {
            while(j < s.length && s[j] < g[i]) {
                j++;
            }
            if (j != s.length) {
                a++;
                j++;
            }
            i++;
        }
        return a;
    }
}