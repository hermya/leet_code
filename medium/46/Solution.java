class Solution {
    public List<List<Integer>> permute(int[] nums) {
        var ans = new ArrayList<List<Integer>>();
        createPermutations(nums, new boolean[nums.length], new Integer[nums.length], 0, ans);
        return ans;
    }

    void createPermutations(int[] nums, boolean[] visited, Integer[] carr, int k, List<List<Integer>> ans) {
        if (k == carr.length) {
            ans.add(List.copyOf(Arrays.asList(carr)));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                carr[k] = nums[i];
                visited[i] = true;
                createPermutations(nums, visited, carr, k + 1, ans);
                visited[i] = false;
            }
        }
    }
}