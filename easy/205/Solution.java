import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        List<Integer>[] sList = new ArrayList[128];
        List<Integer>[] tList = new ArrayList[128];

        var sFirstOc = new int[128];
        var tFirstOc = new int[128];

        for (int i = 0; i < 128; i++) {
            sList[i] = new ArrayList<>();
            sFirstOc[i] = -1;
            tFirstOc[i] = -1;
            tList[i] = new ArrayList<>();
        }

        var sarr = s.toCharArray();
        var tarr = t.toCharArray();

        for (int i = 0; i < sarr.length; i++) {
            if (sFirstOc[sarr[i]] == -1) {
                sFirstOc[sarr[i]] = i;
            }            
            if (tFirstOc[tarr[i]] == -1) {
                tFirstOc[tarr[i]] = i;
            }
            sList[sFirstOc[sarr[i]]].add(i);
            tList[tFirstOc[tarr[i]]].add(i);
        }

        for (int i = 0; i < 128; i++) {
            if (sList[i].size() != tList[i].size()) {
                //System.out.println("num of occurunces not same for " + ((char)i));
                return false;
            } 
            for (int j = 0; j < sList[i].size(); j++) {
                if (!Objects.equals(sList[i].get(j), tList[i].get(j))) {
                    //System.out.println("occurunces not same for " + ((char)i) + " were " + sList[i].get(j) + " and " + tList[i].get(j));
                    return false;
                }
            }
        }
        return true;
    }
}