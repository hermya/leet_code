class Solution {
    public int myAtoi(String s) {
        var x = s.toCharArray();
        var i = 0;
        var ans = 0l;
        var mul = 1;
        while (i < x.length && (x[i] == '\0' || x[i] == ' ')) {
            //System.out.println(x[i]);
            i++;
        }
        if (i == x.length) {
            return 0;
        }
        if (x[i] == '-') {
            mul *= -1; 
            i++;
        } else if (x[i] == '+') {
            i++;
        }

        while (i < x.length && (x[i] >= '0' && x[i] <= '9')) {
            ans = ans * 10 + (x[i] - '0');
            if (ans > Integer.MAX_VALUE) {
                return mul == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE; 
            }
            i++;
        }
        return (int)ans * mul;
    }
}