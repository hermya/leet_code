class Solution {
    public int romanToInt(String s) {
        var rom = s.toCharArray();
        var ans = 0;
        for (int i = rom.length - 1; i >= 0; i--) {
            if (rom[i] == 'I') {
                ans = ans + 1;
            }
            if (rom[i] == 'V') {
                if (i > 0 && rom[i - 1] == 'I') {
                    ans = ans + 4;
                    i--;
                    continue;
                } else {
                    ans = ans + 5;
                }
            }
            if (rom[i] == 'X') {
                if (i > 0 && rom[i - 1] == 'I') {
                    ans = ans + 9;
                    i--;
                    continue;
                } else {
                    ans = ans + 10;
                }
            } if (rom[i] == 'L') {
                if (i > 0 && rom[i - 1] == 'X') {
                    ans = ans + 40;
                    i--;
                    continue;
                } else {
                    ans = ans + 50;
                }
            } if (rom[i] == 'C') {
                if (i > 0 && rom[i - 1] == 'X') {
                    ans = ans + 90;
                    i--;
                    continue;
                } else {
                    ans = ans + 100;
                }
            } if (rom[i] == 'D') {
                if (i > 0 && rom[i - 1] == 'C') {
                    ans = ans + 400;
                    i--;
                    continue;
                } else {
                    ans = ans + 500;
                }
            } if (rom[i] == 'M') {
                if (i > 0 && rom[i - 1] == 'C') {
                    ans = ans + 900;
                    i--;
                    continue;
                } else {
                    ans = ans + 1000;
                }
            }
        }
        return ans;
    }
}