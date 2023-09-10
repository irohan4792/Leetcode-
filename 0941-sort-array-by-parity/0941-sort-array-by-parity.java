class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // int res[] = new int[nums.length];
        for(int i = 0 ; i < nums.length -1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i]%2!=0 && nums[j]%2==0){
                    nums[i]=nums[i]^nums[j];
                    nums[j]=nums[i]^nums[j];
                    nums[i]=nums[i]^nums[j];
                }
            }
        }
        return nums;
    }
}