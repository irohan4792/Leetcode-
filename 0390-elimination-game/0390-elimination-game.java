class Solution {
    public int lastRemaining(int n) {
        int result=0;
        if(n<=1){
            return n;
        }
        else{
            int temp = lastRemaining(n/2);
            result = 2*(1+n/2-temp);
        }
        return result;
    }
}