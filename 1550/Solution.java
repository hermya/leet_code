class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int pos = 0;
        int max = arr.length;
        while (pos < max - 2){
            if (arr[pos] % 2 == 1) {
                if (arr[pos + 1] % 2 == 1) {
                    if (arr[pos + 2] % 2 == 1) {
                        return true;
                    } else {
                        pos += 3;
                    }
                } else {
                    pos += 2;
                }
            } else {
                pos += 1;
            }
        }
        return false;
    }
}