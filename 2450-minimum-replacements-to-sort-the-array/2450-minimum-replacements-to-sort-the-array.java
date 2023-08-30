class Solution {
    boolean checktype(int nums[]){
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i]<nums[i+1]) continue;
            else{
                return false;
            }
        }
        return true;
    }
    public long minimumReplacement(int[] nums) {
        long ans = 0;
        boolean flag = checktype(nums);
        int n=nums.length;
             int last = nums[n - 1];  
        if(flag) return 0;
        else{
        for (int i = n - 2; i >= 0; --i) {
            if (nums[i] > last) {  
                int t = nums[i] / last;  
                if (nums[i] % last != 0) {
                    t++;
                }
                last = nums[i] / t;  
                ans += t - 1;  
            } else {
                last = nums[i];  
                }
            }
        }
        return ans; 
    }
}