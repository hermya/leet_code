class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        var start = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        var end = m*n - 1;
        var mid = (start + end)/2;
        int[] ij;

        while (mid >= start && mid <= end) {
            ij = decodeIJ(mid, n);
            var i = ij[0];
            var j = ij[1];

            //System.out.println("i=" + i + ", j=" + j);
            if (matrix[i][j] == target) {
                return true;
            }

            if (matrix[i][j] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end)/2;
        }
        return false;
    }

    int[] decodeIJ (int val, int n) {
        return new int[] {val/n, val%n};
    }
}