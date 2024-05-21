class Solution {
    public int addDigits(int num) {
        var ans = num%10;
        num /= 10;
        while (num > 0) {
            ans += num%10;
            ans = ans/10 + ans%10;
            num /= 10;
        }
        return ans;
    }
}