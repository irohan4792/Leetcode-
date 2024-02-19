class Solution {
    public boolean isPowerOfTwo(int n) {
                if (n <= 0) {
            return false;
        }
        for (int i = 0; i < 32; i ++) {
            if ((n&1) == 1) {
                break;
            }
            n = n >>> 1;
        }
        n = n >>> 1;
        return n == 0;
    }
}