class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean in = true;
        boolean dec = true;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i]<nums[i+1]) dec = false;
            if(nums[i]>nums[i+1]) in = false;
        }
        return in || dec;
    }
}