class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        var m = potions.length; 
        var ans = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            var min = 0;
            var max = m - 1;
            var x = m;
            long y = spells[i];
            var j = (min + max + 1)/2;
            while (min <= max) {
                if (y * potions[j] >= success) {
                    if (j > 0 && y * potions[j - 1] < success) {
                        ans[i] = m - j;
                        break;
                    } else if (j == 0) {
                        ans[i] = m;
                        break;
                    } else {
                        max = j - 1;
                    }
                } else if (y * potions[j] < success) {
                    min = j + 1;
                } 
                j = (max + min + 1)/2;
            }
        }
        return ans;
    }
}