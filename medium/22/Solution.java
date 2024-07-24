import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        generate(n, 0, 0, 0,  new char[n*2], ans);
        return ans;
    }

    void generate(int n, int debt, int surp, int u, char[] gen, List<String> ans) {
        if (u == n*2) {
            ans.add(String.valueOf(gen));
            return;
        }
        if (u == 0) {
            gen[u] = '(';
            generate(n, debt + 1, surp, u + 1, gen, ans);
            return;
        }
        if (debt < n) {
            gen[u] = '(';
            generate(n, debt + 1, surp, u + 1, gen, ans);
            if (debt > surp) {
                gen[u] = ')';
                generate(n, debt, surp + 1, u + 1, gen, ans);
            }
        } else {
            gen[u] = ')';
            generate(n, debt, surp + 1, u + 1, gen, ans);
        }
        
    }
}