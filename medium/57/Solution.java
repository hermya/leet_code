import java.util.Arrays;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        var ans = new int[intervals.length + 1][2];
        var n = 0;
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }
        var a = newInterval[0];
        int i = 0, j = 0;
        while (i < intervals.length && intervals[i][j] < a) {
            ans[n/2][n%2] = intervals[i][j];
            n++;
            j = 1 - j;
            i = i + (1 - j);
        }
        if (j%2 == 0) {
            ans[n/2][n%2] = a;
            n++;
        }

        a = newInterval[1];
        while (i < intervals.length && intervals[i][j] <= a) {
            j = 1 - j;
            i = i + (1 - j);
        }

        if (i == intervals.length) {
            ans[n/2][n%2] = a;
            n++;
        } else if (j%2 == 0) {
            ans[n/2][n%2] = a;
            n++;
        }

        while (i < intervals.length) {
            ans[n/2][n%2] = intervals[i][j];
            n++;
            j = 1 - j;
            i = i + (1 - j);
        }

        return Arrays.copyOf(ans, n/2);
    }
}