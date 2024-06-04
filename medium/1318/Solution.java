class Solution {
    public int minFlips(int a, int b, int c) {
        var max = Math.max(a, Math.max(b, c));
        int arrLength = Integer.toBinaryString(max).length();
        int[] aB = toBinary(a, arrLength);
        int[] bB = toBinary(b, arrLength);
        int[] cB = toBinary(c, arrLength);
        var ans = 0;
        for (int i = 0; i < arrLength; i++){
            var ip = aB[i] + bB[i];
            var op = cB[i];
            if (op > 0 && ip > 0) {
                continue;
            } else if (op > 0 && ip == 0) {
                ans++;
            } else if (op == 0 && ip > 0) {
                ans += ip;
            }
        }
        return ans;
    }

    int[] toBinary(int n, int l) {
        int[] ans = new int[l];
        int i = 0;
        while (n > 0) {
            ans[i] = n%2;
            n/=2;
            i++;
        }
        return ans;
    }

}