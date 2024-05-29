import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var set1 = new HashSet<Integer>();
        var set2 = new HashSet<Integer>();
        var list1 = IntStream.of(nums1).boxed().collect(Collectors.toSet());
        var list2 = IntStream.of(nums2).boxed().collect(Collectors.toSet());
        
        for (int x : nums1) {
            if (!list2.contains(x)) {
                set1.add(x);
            }
        }

        for (int y : nums2) {
            if (!list1.contains(y)) {
                set2.add(y);
            }
        }

        return List.of(new ArrayList<Integer>(set1), new ArrayList<Integer>(set2));
    }
}