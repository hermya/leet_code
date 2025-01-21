class Solution {
    public int getLucky(String s, int k) {
        int[] start = new int[2*s.length()];
        var lim = 0;
        for (int i = 0; i < s.length(); i++) {
            var val = (s.charAt(i) - 'a') + 1;
            start[lim] = val%10;
            lim++;
            start[lim] = val/10;  
            lim++;
        }
        //System.out.println(Arrays.toString(start));
        var ans = 0;
        while (k > 0) {
            ans = 0;
            for (int i = 0; i < lim ; i++) {
                ans += start[i];
            }
            var temp = ans;
            lim = 0;
            while (temp > 0) {
                start[lim] = temp%10;
                temp = temp/10;
                lim++;
            }
            //System.out.println(ans);
            k--;
        }
        return ans;
    }
}