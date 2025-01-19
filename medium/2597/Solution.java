import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        ArrayList<Integer>[] includeSet = new ArrayList[nums.length];
        for (int i = 0; i < nums.length; i++) {
            includeSet[i] = new ArrayList<>();
            for (int j = i+1; j < nums.length; j++) {
                if (Math.abs(nums[j] - nums[i]) != k) {
                    includeSet[i].add(j);
                }
            }
        }
        //System.out.println(Arrays.toString(includeSet));
        int[] sol = new int[1];
        startPermutation(includeSet, sol);
        return sol[0];
    }

    void startPermutation(ArrayList<Integer>[] inclusionSet, int[] sol) {
        for (int i = 0; i < inclusionSet.length; i++) {
            sol[0]++;
            var baseSet = inclusionSet[i];
            evaluateBaseSet(baseSet, inclusionSet, sol);
        }
    }   

    void evaluateBaseSet(List<Integer> list, ArrayList<Integer>[] inclusionSet, int[] sol) {
        for (int i = 0; i < list.size(); i++) {
            var elem = list.get(i);
            //var cutSet = list.subList(i+1, list.size());
            sol[0]++;
            var crossSet = inclusionSet[elem];
            var finalSet = list.stream().filter(ele -> crossSet.contains(ele)).collect(Collectors.toList());
            evaluateBaseSet(finalSet, inclusionSet, sol);
        }
    }
}
// Redo solution in leet code with inclusion and exclusion set