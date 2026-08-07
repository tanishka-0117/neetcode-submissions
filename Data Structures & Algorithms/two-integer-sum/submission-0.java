class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++){
            int a = nums[i];
            int arr = target - nums[i];

            if(map.containsKey(arr)){
                return new int[]{map.get(arr) , i};
            }

            map.put(a , i);
        }

        return new int[]{-1 , -1};
    }
}
