class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int res[] = new int[nums.length];
        int ev = 0, od=1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%2==0){
                res[ev] = nums[i];
                ev+=2;
            }
            else{
                res[od]=nums[i];
                od+=2;
            }
        }
        return res;
    }
}