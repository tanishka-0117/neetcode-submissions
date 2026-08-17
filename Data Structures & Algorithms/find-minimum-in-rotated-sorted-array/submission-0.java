class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int smallest = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){
            smallest = Math.min(smallest , nums[i]);
        }

        return smallest;
    }
}
