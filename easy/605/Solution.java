class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1 && n <= 1) {
            return flowerbed[0] == 0;
        } else if (flowerbed.length == 1) {
            return false;
        }
        if (flowerbed.length == 2 && n <= 1) {
            return flowerbed[0] == 0 && flowerbed[1] == 0; 
        } else if (flowerbed.length == 2) {
            return false;
        }
        var placed = 0;
        placed = flowerbed[0] == 0 && flowerbed[1] == 0 ? 1 : 0;
        var last = flowerbed[1];
        for (int i = 2; i < flowerbed.length - 1; i++) {
            if (last == 0 && flowerbed[i + 1] == 0 && flowerbed[i] != 1) {
                placed++;
                last = 1;
            } else {
                last = flowerbed[i];
            }
        }

        if (last == 0 && flowerbed[flowerbed.length - 1] == 0) {
            placed++;
        }

        return placed >= n;
    }
}