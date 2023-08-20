class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        // int xor = 0;
        // for(int i = 0 ; i < nums1.length ; i++){
        //     for(int j = 0 ; j < nums2.length ; j++){
        //         xor ^= nums1[i] ^ nums2[j];
        //     }
        // }
        // return xor;  general approach tle
        if(nums1.length %2==0 && nums2.length %2==0) return 0;
        if(nums1.length%2==0) return helper(nums1);
        if(nums2.length%2==0) return helper(nums2);
        return helper(nums1) ^ helper(nums2);
    }
    int helper(int nums[]){
        int f = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            f^=nums[i];
        }
        return f;
    }
}