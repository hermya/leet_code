package optimized_solution;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public List<List<String>> partition(String s) {
        char[] arr = s.toCharArray();
        String[][] sdx = new String[s.length()][s.length()+1];
        for (int i = 0; i < s.length(); i++) {
            sdx[i][i+1] = s.substring(i, i+1);
            for (int j = i+1; j < s.length(); j++) {
                if (isPalindrome(arr, i, j)) {
                    sdx[i][j+1] = s.substring(i, j+1);
                }
            }
        }

        var ans = new ArrayList<List<String>>();
        figurePermutations(sdx, 0, s.length(), new ArrayList<>(), ans);

        return ans;
    }

    void figurePermutations(String sdx[][], int i, int len, List<String> untilNow, List<List<String>> finalList) {
        if (i == len) {
            finalList.add(List.copyOf(untilNow));
        } 

        for (int x = i; x < len; x++) {
            if (Objects.nonNull(sdx[i][x+1])) {
                untilNow.add(sdx[i][x+1]);
                figurePermutations(sdx, x+1, len, untilNow, finalList);
                untilNow.remove(untilNow.size() - 1);
            } 
        }
    }

    boolean isPalindrome(char[] arr, int i, int j) {
        while (i <= j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++; 
            j--;
        }
        return true;
    }
}