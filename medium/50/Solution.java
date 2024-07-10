class Solution {
    public double myPow(double x, int n) {
        var ans = 1d;
        var vals = new double[33];
        vals[0] = 1;
        if (x == 1) {
            return 1;
        }

        if (n > 0) {
            vals[1] = x;
            for (int i = 2; i < 33; i++) {
                vals[i] = vals[i - 1] * vals[i - 1];
            }
            var e = 1;
            while (n > 0) {
                var f = n%2;
                ans = f == 1 ? ans * vals[e] : ans;
                n = n/2;
                e++;
            }

        } else {
            vals[1] = 1/x;
            for (int i = 2; i < 33; i++) {
                vals[i] = vals[i - 1] * vals[i - 1];
            }
            var e = 1;
            var m = ((long) (n)) * -1;
            //System.out.println(m);
            while (m > 0) {
                var f = m%2;
                ans = f == 1 ? ans * vals[e] : ans;
                e++;
                m = m/2;
            }
        }
        return ans;
    }
}