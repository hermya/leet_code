import java.util.HashMap;

class Solution {
    public boolean isHappy(int n) {
        var odaOf = new HashMap<Integer, Integer>();
        var oda = n;
        while (true) {
            if (oda == 1) {
                return true;
            } else if (odaOf.containsKey(oda)) {
                return false;
            } else {
                //System.out.println(oda);
                odaOf.put(oda, getOda(oda));
                oda = getOda(oda);
            }
        }
    }

    int getOda(int n) {
        var x = 0;
        while (n > 0) {
            x += (n%10) * (n%10);
            n = n / 10;
        }
        return x;
    }
}