class Solution {
    public int numTilings(int n) {
        if (n < 3) {
            return n;
        }
        var ans = new long[n + 1];
        ans[1] = 1;
        ans[2] = 2;
        ans[3] = 5;
        int k = 3;
        while ( k < n) {
            k++;
            var temp = 0l;
            for (int i = 1; i < k; i++) {
                if (i < 3) {
                    temp += ans[k-i] % 1000000007;
                } else {
                    temp += (2 * ans[k-i]) % 1000000007;
                }
            }
            ans[k] = (temp + 2) % 1000000007;
        }
        return (int)(ans[n] % 1000000007);
    }

}