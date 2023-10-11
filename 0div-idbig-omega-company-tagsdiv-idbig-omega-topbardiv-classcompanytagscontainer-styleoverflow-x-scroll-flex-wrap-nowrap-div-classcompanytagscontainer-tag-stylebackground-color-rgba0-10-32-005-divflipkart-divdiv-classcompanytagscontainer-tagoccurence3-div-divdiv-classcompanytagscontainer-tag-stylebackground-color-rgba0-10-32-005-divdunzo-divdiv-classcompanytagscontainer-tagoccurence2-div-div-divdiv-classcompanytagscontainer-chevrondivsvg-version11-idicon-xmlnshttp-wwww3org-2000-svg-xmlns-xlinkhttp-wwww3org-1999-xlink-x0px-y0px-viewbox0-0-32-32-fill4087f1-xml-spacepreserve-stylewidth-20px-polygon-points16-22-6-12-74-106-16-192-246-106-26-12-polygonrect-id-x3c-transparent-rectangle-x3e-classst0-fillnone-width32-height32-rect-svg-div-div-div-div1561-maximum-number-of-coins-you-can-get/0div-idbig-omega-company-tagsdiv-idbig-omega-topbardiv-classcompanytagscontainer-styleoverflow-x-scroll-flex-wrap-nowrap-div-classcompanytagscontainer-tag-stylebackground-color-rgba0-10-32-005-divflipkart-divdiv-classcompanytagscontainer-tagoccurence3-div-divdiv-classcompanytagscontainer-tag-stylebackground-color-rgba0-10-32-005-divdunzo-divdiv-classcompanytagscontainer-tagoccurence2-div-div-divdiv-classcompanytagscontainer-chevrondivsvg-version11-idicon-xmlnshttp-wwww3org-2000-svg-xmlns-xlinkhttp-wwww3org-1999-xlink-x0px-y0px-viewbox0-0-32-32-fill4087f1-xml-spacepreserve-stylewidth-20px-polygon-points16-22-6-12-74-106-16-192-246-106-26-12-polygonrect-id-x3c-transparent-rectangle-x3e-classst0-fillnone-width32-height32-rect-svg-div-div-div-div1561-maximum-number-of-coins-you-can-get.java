class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles); // Sort the array in ascending order.
        int n = piles.length / 3;
        int res = 0;
        
        // Start from the end of the sorted array, as the largest piles will be at the end.
        int j = piles.length - 2;
        for (int i = 0; i < n; i++) {
            res += piles[j];
            j -= 2; // Move to the next group of three.
        }
        
        return res;
    }
}