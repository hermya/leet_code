import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] ans = new int[intervals.length][2];
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        var noi = 1;
        ans[0] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > ans[noi - 1][1]) {
                ans[noi] = intervals[i];
                noi++;
            } else {
                ans[noi - 1][1] = Math.max(intervals[i][1], ans[noi - 1][1]);
            }
        }
        return Arrays.copyOf(ans, noi);
    }
}