import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> this.compare(a[0], b[0]));
        var ans = 0;
        int i = 0;
        while (i < points.length) {
            ans++;
            var x = points[i][1];
            while (i < points.length && points[i][0] <= x) {
                x = Math.min(x, points[i][1]);
                i++;
            }
        }

        return ans;
    }

    int compare(int a , int b) {
        if (a > b) {
            return 1;
        } if (b > a) {
            return -1;
        }
        return 0;
    }
}