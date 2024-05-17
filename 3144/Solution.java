import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minimumSubstringsInPartition(String s) {
        String[] arr = s.split("");
        List<Integer>[] iKeeper = new ArrayList[arr.length + 1];
        for (int i = 0; i <= arr.length; i++) {
            iKeeper[i] = new ArrayList<>();
        }
        for (int i = 0; i < arr.length; i++) {
            var temp = new BalString(arr[i]);
            iKeeper[i+1].add(i);
            for (int j = i+1; j < arr.length; j++) {
                var bl = temp.appendAndTell(arr[j]);
                if (bl) {
                    iKeeper[j+1].add(i);
                }
            }
        }

        int[] dp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1001;
        }
        dp[arr.length] = 0;
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < iKeeper[i].size(); j++) {
                dp[iKeeper[i].get(j)] = Math.min(dp[iKeeper[i].get(j)], dp[i] + 1);
            }
        }
        return dp[0];
    }
}

class BalString { // expecting string of size 1 to begin with
    int[] count = new int[27];
    int uniChars = 0;
    int expectedChecksum = 0;
    int max = 0;

    BalString(String x) {
        var tempOrd = x.charAt(0) - 'a';
        this.count[tempOrd] = 1;
        uniChars++;
        expectedChecksum += 1;
        max = 1;
    } 

    boolean appendAndTell(String another) { // another is also expected to be of size 1
        var tempOrd = another.charAt(0) - 'a';
        if (this.count[tempOrd] == 0) {
            this.expectedChecksum++;
        }
        this.count[tempOrd]++;
        this.uniChars++;
        this.max = Math.max(this.max, this.count[tempOrd]);
        return this.uniChars == this.max * this.expectedChecksum; 
    }
}