class Solution {
    public int[] countBits(int n) {
        var keeper = new int[n + 1];
        var ans = new int[n+1];
        for (int i = 1; i <= n; i++) {
            ans[i] = getBitCount(i, keeper);
        }
        return ans;
    }

    int getBitCount(int n, int[] keeper){
        if (n == 0) {
            return 0;
        }
        var c = n%2;
        var k = n/2;
        keeper[n] = c + keeper[k];
        return keeper[n];
    }
}