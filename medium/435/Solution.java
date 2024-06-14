import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> compare(a, b));
        // for (int[] x : intervals) {
        //     System.out.print(Arrays.toString(x) + ", ");
        // }
        // System.out.println();
        var lastMax = intervals[0][1];
        var r = 0;
        for (int i = 1; i < intervals.length; i++) {
            var min = intervals[i][0];
            var max = intervals[i][1];
            if (min < lastMax) {
                r++;
                lastMax = Math.min(lastMax, max);
            } else {
                lastMax = max;
            }
        }
        return r;
    }
    int compare(int[] a, int[] b) {
        if (a[0] != b[0]) {
            return a[0] - b[0];
        }
        return a[1] - b[1];
    }
}