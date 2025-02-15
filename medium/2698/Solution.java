class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        boolean[] interResult = new boolean[1];
        for (int i = 1; i <= n; i++) {
            int[] temp = getRep(i*i);
            evaluateSubSequenceSums(i, temp, 0, 0, interResult);
            if (interResult[0]) {
                ans += i*i;
            }

            interResult[0] = false;
        }
        return ans;
    }

    int[] getRep(int x) {
        int[] temp = new int[7];
        int b = temp.length - 1;
        while (x > 0) {
            temp[b] = x%10;
            x = x/10;
            b--;
        }

        return Arrays.copyOfRange(temp, b + 1, temp.length);
    }

    void evaluateSubSequenceSums(int expected, int[] representation, int prev, int pos, boolean[] result) {
        if (pos == representation.length) {
            if (expected == prev) {
                result[0] = true;
            }
            return;
        } else if (expected < prev) {
            return;
        }
        int temp = 0;
        for (int i = pos; i < representation.length; i++) {
            temp = temp*10 + (representation[i]);
            evaluateSubSequenceSums(expected, representation, prev + temp, i + 1, result);
        }
    }

}