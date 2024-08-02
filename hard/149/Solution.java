class Solution {
    public int maxPoints(int[][] points) {
        var ans = 0;
        for (int i = 0; i < points.length; i++) {
            var count = 1;
            ans = Math.max(count, ans);
            var p0x = points[i][0];
            var p0y = points[i][1];

            for (int j = i + 1; j < points.length; j++) {
                var p1x = points[j][0];
                var p1y = points[j][1];
                count = 2;

                if (p1x == p0x) {
                    for (int k = j + 1; k < points.length; k++) {
                        //System.out.println("y=" + points[k][1] + ", x=" + points[k][0]);
                        count += p0x == points[k][0] ? 1 : 0;;
                    }
                } else {
                    for (int k = j + 1; k < points.length; k++) {
                        //System.out.println("y=" + points[k][1] + ", m=" + (float)(p1y - p0y)/(p1x - p0x) + ", x=" + points[k][0] + ", c=" + c);
                        var lhs = (points[k][1] - p1y) * (p1x - p0x);
                        var rhs = (points[k][0] - p1x) * (p1y - p0y);
                        //System.out.println("LHS=" + points[k][1] + ", RHS=" + ((p1y - p0y) * points[k][0] /(p1x - p0x) + c));
                        count += lhs == rhs? 1 : 0;;
                    }
                }
                ans = Math.max(ans, count);
            }
            
        }
        return ans;
    }

}