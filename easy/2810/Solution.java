import java.util.List;
import java.util.ArrayList;

class Solution {
    public String finalString(String s) {
        var dq = new DQ();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                dq.direction = (!dq.direction);
                continue;
            }
            
            if (dq.direction) {
                dq.pushBack(s.charAt(i));
            } else {
                dq.pushFront(s.charAt(i));
            }
        }
        return dq.coallesce();
    }
}

class DQ {
    List<Character> eles = new ArrayList<>();
    boolean direction = false;
    void pushBack(char n) {
        eles.add(0, n);
    }
    void pushFront(char n) {
        eles.add(n);
    }
    String coallesce() {
        var f = "";
        if (direction) {
            for (int i = eles.size() - 1; i >= 0; i--) {
                f+= eles.get(i);
            }
        } else
        for (Character s : eles) {
            f += s;
        }
        return f;
    }
}