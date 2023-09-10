class Solution {
    public int[] rearrangeArray(int[] nums) {
        int m = nums.length;
        int pos[]=new int[m/2];
        int neg[]=new int[m/2];
        int p=0,n=0;
        for(int i=0 ; i<m ; i++){
            if(nums[i]>0){
                pos[p]=nums[i];
                p++;
            }else{
                neg[n]=nums[i];
                n++;
            }       
        }
        for(int i=0 ; i<m/2 ; i++){
            nums[2*i]=pos[i];
            nums[2*i+1]=neg[i];
        }  
        return nums;      
    }
}