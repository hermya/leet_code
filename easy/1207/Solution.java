import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] counter = new int[2001];

        for (int i = 0; i < arr.length; i++) {
            counter[arr[i] + 1000]++;
        }
        
        var hashSet = new HashSet<Integer>();
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                if (!hashSet.add(counter[i])) {
                    return false;
                }
            } 
        }
        return true;
    }
}