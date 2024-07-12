class Solution {
    public void rotate(int[][] matrix) {
        var szx = matrix[0].length;
        int tri = 0, trj = 0, tli = 0, tlj = 0, bri = 0, brj = 0, bli = 0, blj = 0, m = 0, k, len = 0, temp = 0;
        k = szx - 1;
        while (szx > 0) {
            tli = m;
            tlj = m;
            tri = m;
            trj = k;
            bri = k;
            brj = k;
            bli = k;
            blj = m;
            len = szx;
            while (len > 1) {
                temp = matrix[tli][tlj];
                matrix[tli][tlj] = matrix[bli][blj];
                matrix[bli][blj] = matrix[bri][brj];
                matrix[bri][brj] = matrix[tri][trj];
                matrix[tri][trj] = temp;
                len--;
                tlj++;
                bli--;
                brj--;
                tri++;
            }
            m++;
            k--;
            szx = szx - 2;
        }
    }
}