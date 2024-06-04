import java.util.LinkedList;

class Solution {
    public String predictPartyVictory(String senate) {
        var queue = new LinkedList<Integer>();
        // R = 0;
        // D = 1;
        var r = 0;
        var rDue = 0;
        var dDue = 0;
        var d = 0;
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                queue.addLast(0);
                r++;
            } else {
                queue.addLast(1);
            }
        }
        d = senate.length() - r;

        while (r > 0 && d > 0) {
            var x = queue.pollFirst();
            if (x == 0) {
                if (rDue > 0) {
                    rDue--;
                } else {
                    dDue++;
                    d--;
                    queue.addLast(x);
                }
            }
            if (x == 1) {
                if (dDue > 0) {
                    dDue--;
                } else {
                    rDue++;
                    r--;
                    queue.addLast(x);
                }
            }
        }
        if (d > r) {
            return "Dire";
        }
        return "Radiant";
    }
}