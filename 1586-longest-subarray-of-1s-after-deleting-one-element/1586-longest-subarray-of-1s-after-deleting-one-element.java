class Solution {
    public int longestSubarray(int[] nums) {
        int zercount = 0;
        int longwind = 0;
        int start = 0;
        for(int i = 0 ; i < nums.length ; i++){
            zercount+= nums[i]==0 ? 1 : 0;
            while(zercount>1){
                zercount -= nums[start]==0 ? 1 : 0;
                start++;
            }
            longwind = Math.max(longwind, i-start);
        }
        return longwind;
    }
}