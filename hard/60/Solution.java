class Solution {
    public String getPermutation(int n, int k) {
        int place = n - 1;
        String ans = "";
        int[] factorial = getFactorials();
        int[] available = new int[n];
        k--;
        for (int i = 0; i < n; i++) {
            available[i] = i + 1;
        }

        while (ans.length() < n) {
            //  7 <-> 12 ~> 2 ? (7 + 5 )/ 6 & ( 12 + 5 ) / 6
            int index = Math.max(k/ factorial[place], 0);
            int c = 0;
            for (int i = 0; i < available.length; i++) {
                if (available[i] != -1) {
                    if (c == index) {
                        ans += available[i];
                        available[i] = -1;
                    } 
                    c++;
                }
            }
            // System.out.println(ans + ", available = " + Arrays.toString(available));
            k = k % factorial[place];
            // System.out.println("new k = " + k);
            place--;
        }

        return ans;
    }

    private int[] getFactorials() {
        int[] facts = new int[10];
        facts[0] = 1;
        for (int i = 1; i < 10; i++) {
            facts[i] = i * facts[i - 1];
        }
        return facts;
    }
}