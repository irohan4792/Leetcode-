class Solution {
    public int maxProfit(int[] prices, int fee) {
        int res = 0;
        int hold = -prices[0];
        for (int i : prices){
            int temp = hold;
            hold = Math.max(hold, res-i);
            res = Math.max(res, temp+i-fee);
        }
        return res;
    }
}