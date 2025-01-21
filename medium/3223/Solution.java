class Solution {
    public int minimumLength(String s) {
        var counter = new int[26];

        for (char c: s.toCharArray()) {
            counter[c - 'a']++;
        }

        int numOfEvens = 0, numOfOdds = 0;
        for (int i : counter) {
            if (i == 0) {
                continue;
            }
            numOfEvens += i % 2 == 0 ? 1 : 0;
            numOfOdds += i % 2 == 0 ? 0 : 1;
        }
        return numOfOdds + 2 * numOfEvens;
    }
}