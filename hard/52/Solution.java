class Solution {
    public int totalNQueens(int n) {
        var rmap = new int[n];
        var cmap = new int[n];
        var fdmap = new int[n*2 - 1]; // (n - 1) + (i-j) = [0, 1, 2, ... n*2 - 2];
        var bdmap = new int[n*2 - 1]; // i + j = [0, 1, 2 .. n*2 - 2];
        var ans = new int[1];

        traverse(n, 0, ans, rmap, cmap, fdmap, bdmap);
        return ans[0];
    }

    void traverse(int n, int i, int[] ans, int[] rmap, int[] cmap, int[] fdmap, int[] bdmap) {
        if (i == n) {
            ans[0]++;
            return;
        }

        for (int j = 0; j < n; j++) {
            if (rmap[i] == 0 && cmap[j] == 0 && fdmap[n - 1 + i - j] == 0 && bdmap[i + j] == 0) {
                rmap[i] = 1;
                cmap[j] = 1;
                fdmap[n - 1 + i - j] = 1;
                bdmap[i + j] = 1;
                ans[0]++;
                traverse(n, i + 1, ans, rmap, cmap, fdmap, bdmap);
                rmap[i] = 0;
                cmap[j] = 0;
                fdmap[n - 1 + i - j] = 0;
                bdmap[i + j] = 0;
                ans[0]--;
            }
        }
    }
}