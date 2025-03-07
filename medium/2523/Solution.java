class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] ans = new int[]{-1, -1};
        int first = -1;
        int second = -1;


        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                //System.out.println(i + " is prime");
                if (ans[0] == -1) {
                    ans[0] = i;
                    first = i;
                } else if (ans[1] ==  -1) {
                    ans[1] = i;
                    first = i;
                } else {
                    second = i;
                    //System.out.println(second + ", " + first);
                    if (second - first < ans[1] - ans[0]) {
                        ans[0] = first;
                        ans[1] = second;
                    }
                    first = i;
                    if (ans[1] - ans[0] == 2) {
                        return ans;
                    }
                }
            }
            //System.out.println(Arrays.toString(ans));
        }
        if (ans[1] == -1) {
            return new int[]{-1, -1};
        } else {
            return ans;
        }
    }

    boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        if (x == 2 || x == 5 || x == 3 || x == 7) {
            return true;
        }
        if (x % 2 == 0 || x % 5 == 0) {
            return false;
        }

        int lim = (int)Math.sqrt(x) + 1;
        int pad = 0;
        for (int i = 0; i < lim; i+=10) {
            if (i != 0 && x % (i + 1) == 0) {
                return false;
            } else if (x % (i + 3) == 0) {
                return false;
            } else if (x % (i + 7) == 0) {
                return false;
            } else if (x % (i + 9) == 0) {
                return false;
            }
        }

        return true;
    }
}