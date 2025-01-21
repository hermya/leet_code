class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C = new int[B.length];
        int[] ans = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            C[A[i] - 1]++;
            C[B[i] - 1]++;
            int curr = 0;
            for (int j = 0; j < B.length; j++) {
                if (C[j] == 2) {
                    C[j] = 0;
                    curr++;
                }
            }
            if (i == 0) {
                ans[i] = curr;
            } else {
                ans[i] += ans[i - 1] + curr;
            }
        }
        return ans;
    }
}