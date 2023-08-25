class Solution {
 public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        for (int i = left; i <= right; i++) {
            if (isPrimeSetBits(i)) {
                cnt++;
            }
        }
        return cnt;
    }
    
    boolean isPrimeSetBits(int n) {
        int bitCount = countSetBits(n);
        return isPrime(bitCount);
    }
    
    int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
    
    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}