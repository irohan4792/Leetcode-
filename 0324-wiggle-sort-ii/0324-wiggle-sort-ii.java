class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int ans[] = new int[nums.length];
        int i = 1;
        int j = nums.length-1;
        while(i<nums.length){
            ans[i]=nums[j];
            j--;
            i+=2;
        }
        i=0;
        while(i<nums.length){
            ans[i]=nums[j];
            j--;
            i+=2;
        }
        for(int k = 0 ; k < ans.length ; k++){
            nums[k]=ans[k];
        }
    }
}