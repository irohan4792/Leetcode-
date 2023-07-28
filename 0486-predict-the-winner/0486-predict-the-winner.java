class Solution {
    int dp [][];
    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        dp = new int [len][len];
        for(int i = 0 ; i < len ; ++i){
            Arrays.fill(dp[i], -1);
        }
        return check(nums,0,len-1)>=0;
    }
    int check(int nums[], int l, int r){
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        if(l==r){
            return nums[l];
        }
        int left = nums[l]-check(nums,l+1,r);
        int right = nums[r]-check(nums,l,r-1);
        dp[l][r]=Math.max(left,right);
        return dp[l][r];
    }
}