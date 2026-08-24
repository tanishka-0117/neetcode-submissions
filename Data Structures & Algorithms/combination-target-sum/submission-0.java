class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        back(0 , nums , new ArrayList<>(), res , target);

        return res;
    }

    private void back(int idx , int[] nums , List<Integer> curr , List<List<Integer>> res , int target){
       if(target == 0){
         res.add(new ArrayList<>(curr));
         return;
       }

       if(target < 0){
        return;
       }

        for(int i = idx;i<nums.length;i++){
            curr.add(nums[i]);

            back(i , nums , curr , res , target - nums[i]);

            curr.remove(curr.size() - 1);
        }
    } 
}
