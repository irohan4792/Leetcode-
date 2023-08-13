class Solution {
    public boolean validPartition(int[] nums) {
        int n=nums.length;
        boolean dp[]=new boolean[n+1];
        dp[n]=true;
        for(int i=n-1;i>=0;i--){
            if(i+1<n){
                if(nums[i]==nums[i+1] && dp[i+2]){
                    dp[i]=true;
                }
                if(i+2<n){
                    if(((nums[i]==nums[i+1] && nums[i+1]==nums[i+2]) || (nums[i]+1==nums[i+1] && nums[i+1]+1==nums[i+2]) ) && dp[i+3] ){
                        dp[i]=true;
                    }
                }
            }
        }
        return dp[0];
    }
}