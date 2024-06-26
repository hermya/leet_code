import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        var m = matrix.length;
        var n = matrix[0].length;
        var ans = new LinkedList<Integer>();
        var sign = 1;
        var dir = true;
        var t = 0;
        int i = 0;
        int j = 0;
        var tot = m * n;

        while (t < tot) {
            ans.add(matrix[i][j]);
            if (dir) { // horizontal
                matrix[i][j] = 101;
                j += sign;
                if (j == n || j == -1 || matrix[i][j] == 101) {
                    j -= sign;
                    i += sign;
                    dir = false;
                }
            } else {
                matrix[i][j] = 101;
                i += sign;
                if (i == m || i == -1 || matrix[i][j] == 101) {
                    i -= sign;
                    sign = sign * -1;
                    j += sign;
                    dir = true;
                }
            }
            t++;
        }
        return ans;
    }
}