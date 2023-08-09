class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int min = 0;
        int max = (int)Math.pow(10,9);
        int res = Integer.MAX_VALUE;
        while(min<=max){
            int mid = (min+max)/2;
            if(helper(mid, nums, p)==true){
                res = mid;
                max=mid-1;
            }
            else min=mid+1;
        }
        return res;
    }
    public boolean helper(int num, int nums[], int p){
        int cnt = 0;
        int i = nums.length-1;
        while(i>0){
            if(nums[i]-nums[i-1]<=num){
                cnt++;
                i-=2;
            }
            else i--;
            if(cnt>=p) return true;
        }
        if(cnt>=p){
            return true;
        }
        else return false;
    }
}