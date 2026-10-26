class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> memo = new HashMap<>();
        return solve(nums, 0, 0, target, memo);
    }

    private int solve(int[] nums, int index, int sum, int target,
                      Map<String, Integer> memo) {
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        String key = index + "," + sum;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int add = solve(nums, index + 1, sum + nums[index], target, memo);
        int subtract = solve(nums, index + 1, sum - nums[index], target, memo);

        memo.put(key, add + subtract);
        return memo.get(key);
    }
}
