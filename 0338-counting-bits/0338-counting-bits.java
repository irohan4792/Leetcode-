class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i = 0 ; i <=n ; i++){
            ans[i] = countbits(i);
        }
        return ans;
    }
    public int countbits(int n){
        if(n==0) return 0;
        return (n&1)+countbits(n>>1);
    }
}