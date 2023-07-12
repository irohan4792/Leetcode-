class Solution {
    public int sumBase(int n, int k) {
        if(n==k) return 1;
        int res=0;
        while(n>0){
            res+=n%k;
            n/=k;
        }
        return res;
    }
}