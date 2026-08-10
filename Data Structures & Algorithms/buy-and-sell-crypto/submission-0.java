class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if(prices == null || prices.length==0){
            return 0;
        }

        int pur = prices[0];
        int maxprofit = 0;

        for(int i = 0;i<n;i++){
            if(prices[i] < pur){
                pur = prices[i];
            }
            else if(prices[i] - pur > maxprofit){
                maxprofit = prices[i] - pur;
            }
        }

        return maxprofit;
    }
}
