import java.util.Objects;

class Solution {
    public String minWindow(String s, String t) {
        var map = new LocHol[128];
        var len = s.length();
        for (int i = 0; i < t.length(); i++) {
            var key = t.charAt(i);
            if (Objects.nonNull(map[key])) {
                map[key].maxNum++;
            } else {
                map[key] =  new LocHol(len);
            }
        }
        var l = 0;
        var h = 0;
        var finalLen = Integer.MAX_VALUE;
        var lc = 0;
        var explen = t.length();
        var temph = 0;
        var templ = 0;
        for (int i = 0; i < len; i++) {
            var key = s.charAt(i);
            if (Objects.nonNull(map[key])) {
                lc += map[key].push(i);
                if (lc == explen) {
                    templ = getMin(map);
                    temph = i+1;;
                    if (temph - templ < finalLen) {
                        finalLen = temph -templ;
                        h = temph;
                        l = templ;
                    }
                }
            }
        }
        return s.substring(l, h);
    }

    int getMin(LocHol[] map){
        var min = new int[]{Integer.MAX_VALUE};
        for (int i = 0; i < map.length; i++) {
            if (Objects.nonNull(map[i]))
            min[0] = Math.min(min[0], map[i].inds[map[i].b]);
        }
        return min[0];
    }
    
}

class LocHol {
    int[] inds;
    int maxNum;
    int f;
    int b;

    LocHol(int maxSize) {
        this.inds = new int[maxSize];
        this.maxNum = 1;
        this.f = 0;
        this.b = 0;
    }

    int push(int x){
        inds[f] = x;
        f++;
        if(f-b > maxNum) {
            b++;
            return 0;
        }
        return 1;
    }

    int[] getQ(){
        int[] q = new int[maxNum];
        for (int i = b; i < f; i++) {
            q[i - b] = inds[i];
        }
        return q;
    }

}