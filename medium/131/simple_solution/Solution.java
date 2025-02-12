package simple_solution;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
		var ans = new ArrayList<List<String>>();
		recurse(s, new ArrayList<>(s.length()), ans, 0);
		return ans;
    }
	
	void recurse(String s, 
				List<String> currentPals, 
				List<List<String>> finalPals, 
				int currPos) {
		if (s.length() == currPos) {
			finalPals.add(List.copyOf(currentPals));
			return;
		}
		
		String curr = String.valueOf(s.charAt(currPos));
		
		for (int i = currPos + 1; i < s.length(); i++) {
			if (palindrome(curr)) {
				currentPals.add(curr);
				recurse(s, currentPals, finalPals, i);
				currentPals.remove(currentPals.size() - 1);
			}
			curr += s.charAt(i);
		}
		if (palindrome(curr)) {
			currentPals.add(curr);
			finalPals.add(List.copyOf(currentPals));
			currentPals.remove(currentPals.size() - 1);			
		}
	}
	
	boolean palindrome(String s) {
		char[] sarr = s.toCharArray();
		int i = 0;
		int j = sarr.length - 1; 
		while (i < j) {
			if (sarr[i] != sarr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}

// at any point, I want to first check if current string is palindrome by itself?
// If yes, call recursion
// Out of if, increase the length of current string and check again