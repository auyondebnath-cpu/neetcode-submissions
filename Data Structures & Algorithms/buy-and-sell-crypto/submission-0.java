class Solution {
    public int maxProfit(int[] prices) {
        int highest = 0;
        for(int i =0; i<prices.length; i++){
            for(int j= i+1; j<prices.length; j++){
                if(prices[j]-prices[i]>highest){
                    highest = prices[j]-prices[i];
                    if(highest<0){
                        highest =0;
                    }
                }
            }
        }
        return highest;
    }
}
