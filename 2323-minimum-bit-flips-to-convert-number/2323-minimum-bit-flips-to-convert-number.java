class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start^goal;
        int res = 0;
        while(xor>0){
            xor&=xor-1;
            res++;
        }
        return res;
    }
}