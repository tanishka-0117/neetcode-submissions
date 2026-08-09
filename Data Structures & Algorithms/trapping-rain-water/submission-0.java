class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int left = 0;
        int right = height.length -1;
        int lheight = 0;
        int rheight = 0;
        int water =0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= lheight){
                    lheight = height[left];
                }
                else{
                    water += lheight - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= rheight){
                    rheight = height[right];
                }
                else{
                    water += rheight - height[right];
                }
                right--;
            }
        }
        return water;
    }
}
