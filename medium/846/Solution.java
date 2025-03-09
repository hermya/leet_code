import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        Arrays.sort(hand);
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();

        for (int i = 0; i < hand.length; i++) {
            if (!map.containsKey(hand[i])){
                map.put(hand[i], new LinkedList<>());
            }        

            map.get(hand[i]).addLast(i);
        }

        //System.out.println(map);

        //System.out.println(Arrays.toString(hand));

        for (int i = 0; i < hand.length; i++) {
            while (i < hand.length && hand[i] == -1) {
                i++;
            }
            if (i == hand.length) {
                return true;
            }
            int next = hand[i];
            int currSize = 0;
            while (currSize < groupSize) {
                if (map.containsKey(next)) {
                    var indices = map.get(next);
                    if (indices.isEmpty()) {
                        //System.out.println("line 36, looking for " + next);
                        return false;
                    } else {
                        int index = indices.pollFirst();
                        hand[index] = -1;
                    }
                } else {
                    //System.out.println("line 36");
                    return false;
                }
                next += 1;
                currSize++;
            }
            //System.out.println(Arrays.toString(hand));
        }

        return true;
    }
}