import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<String>> solveNQueens(int n) {
        int[] r = new int[n];
        int[] c = new int[n];
        int[] fd = new int[n*2 - 1];
        int[] bd = new int[n*2 - 1];

        var ans = new ArrayList<List<String>>();

        traverse(n, r, c, fd, bd, ans, 0, new ArrayList<String>(n), new char[]{'.','.','.','.','.','.','.','.','.','.'} );
        return ans;
    }

    void traverse(int n, int[] r, int[] c, int[] fd, int[] bd, List<List<String>> ans, int i, List<String> temp, char[] dotArray) {
        if (i == n) {
            // make ans here;
            ans.add(List.copyOf(temp));
            return;
        }

        for (int j = 0; j < n; j++) {
            if (r[i] == 0 && c[j] == 0 && fd[n - i + j - 1] == 0 && bd[i + j] == 0) {
                r[i] = 1;
                c[j] = 1;
                fd[n - i + j - 1] = 1;
                bd[i + j] = 1;
                
                var cp = Arrays.copyOf(dotArray, n);
                cp[j] = 'Q';
                temp.add(String.valueOf(cp));
                
                traverse(n, r, c, fd, bd, ans, i + 1, temp, dotArray);
                
                temp.remove(temp.size() - 1);
                
                r[i] = 0;
                c[j] = 0;
                fd[n - i + j - 1] = 0;
                bd[i + j] = 0;
            }
        }
    }
}