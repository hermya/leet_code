class Solution {
    public int mySqrt(int x) {
        var sqr = 0L;
        var ans = 0L;
        if (x < 2) {
            return x;
        }
        for (long i = 0; i < x; i++) {
            sqr = i*i;
            if (sqr > (long)x) {
                return (int)ans;
            } else if (sqr == x) {
                return (int)i;
            }
            ans = i;
        }
        return (int)ans;
    }
}