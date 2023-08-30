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
             int last = nums[n - 1];  // Initialize 'last' with the last element
        if(flag) return 0;
        else{
        // long ans = 0;  // Initialize the total operations count

        // Traverse the array in reverse order
        for (int i = n - 2; i >= 0; --i) {
            if (nums[i] > last) {  // If the current element needs replacement
                int t = nums[i] / last;  // Calculate how many times the element needs to be divided
                if (nums[i] % last != 0) {
                    t++;  // If there's a remainder, increment 't'
                }
                last = nums[i] / t;  // Update 'last' for the next comparison
                ans += t - 1;  // Add (t - 1) to 'ans' for the number of operations
            } else {
                last = nums[i];  // Update 'last' without replacement
            }
        }
        }
        return ans; 
    }
}