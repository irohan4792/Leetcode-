class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            for(int j = 1 ; j < nums.length ; j++){
                if(Math.abs(nums[i]-nums[j])==k && i < j){
                    cnt++;
                    System.out.println(i + " " + j);
                }
            }
        }
        return cnt;
    }
}