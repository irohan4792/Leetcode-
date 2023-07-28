class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int i = 0;
        int freq [] = new int[10000];
        int ans [] = new int[arr1.length];
        for(int t : arr1){
            freq[t]++;
        } 
        for (int k : arr2){
            while(freq[k]!=0){
                ans[i++]=k;
                freq[k]--;
            }
        }
        for(int r = 0 ; r < freq.length ; r++){
            while(freq[r]!=0){
                ans[i++]=r;
                freq[r]--;
            }
        }
        return ans;
    }
}