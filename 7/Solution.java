class Solution {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        var maxInt = Integer.MAX_VALUE;
        var val = Math.abs(x);
        var sign = x/val;
        if (val < 0) {
            return 0;
        }
        var ans = 0;
        while (val > 0) {
            if (ans != 0 && maxInt/ans < 10){
                return 0;
            }
            ans = ans*10 + val%10;
            val /= 10;
        }
        if (ans < 0) {
            return 0;
        }
        return ans * sign;
    }
}