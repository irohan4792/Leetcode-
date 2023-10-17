class Solution {
    public int minPairSum(int[] nums) {
        int res =0;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            int temp = nums[i]+nums[j];
            res = Math.max(res, temp);
            i++;
            j--;
        }
        return res;
    }
}