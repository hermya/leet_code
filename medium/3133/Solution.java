class Solution {
    public long minEnd(int n, int x) {
        int[] array = new int[64];
        for (int i = 0; i < 64; i++) {
            array[i] = x%2;
            x = x / 2; 
        }
        n = n - 1;
        var sol = 0l;
        var mul = 1l;
        for (int i = 0; i < 64; i++) {
            if (array[i]!= 1){
                array[i] = n%2;
                n = n/2;
            }
            sol += array[i] * mul;
            mul *= 2;
        }
        return sol;
    }
}