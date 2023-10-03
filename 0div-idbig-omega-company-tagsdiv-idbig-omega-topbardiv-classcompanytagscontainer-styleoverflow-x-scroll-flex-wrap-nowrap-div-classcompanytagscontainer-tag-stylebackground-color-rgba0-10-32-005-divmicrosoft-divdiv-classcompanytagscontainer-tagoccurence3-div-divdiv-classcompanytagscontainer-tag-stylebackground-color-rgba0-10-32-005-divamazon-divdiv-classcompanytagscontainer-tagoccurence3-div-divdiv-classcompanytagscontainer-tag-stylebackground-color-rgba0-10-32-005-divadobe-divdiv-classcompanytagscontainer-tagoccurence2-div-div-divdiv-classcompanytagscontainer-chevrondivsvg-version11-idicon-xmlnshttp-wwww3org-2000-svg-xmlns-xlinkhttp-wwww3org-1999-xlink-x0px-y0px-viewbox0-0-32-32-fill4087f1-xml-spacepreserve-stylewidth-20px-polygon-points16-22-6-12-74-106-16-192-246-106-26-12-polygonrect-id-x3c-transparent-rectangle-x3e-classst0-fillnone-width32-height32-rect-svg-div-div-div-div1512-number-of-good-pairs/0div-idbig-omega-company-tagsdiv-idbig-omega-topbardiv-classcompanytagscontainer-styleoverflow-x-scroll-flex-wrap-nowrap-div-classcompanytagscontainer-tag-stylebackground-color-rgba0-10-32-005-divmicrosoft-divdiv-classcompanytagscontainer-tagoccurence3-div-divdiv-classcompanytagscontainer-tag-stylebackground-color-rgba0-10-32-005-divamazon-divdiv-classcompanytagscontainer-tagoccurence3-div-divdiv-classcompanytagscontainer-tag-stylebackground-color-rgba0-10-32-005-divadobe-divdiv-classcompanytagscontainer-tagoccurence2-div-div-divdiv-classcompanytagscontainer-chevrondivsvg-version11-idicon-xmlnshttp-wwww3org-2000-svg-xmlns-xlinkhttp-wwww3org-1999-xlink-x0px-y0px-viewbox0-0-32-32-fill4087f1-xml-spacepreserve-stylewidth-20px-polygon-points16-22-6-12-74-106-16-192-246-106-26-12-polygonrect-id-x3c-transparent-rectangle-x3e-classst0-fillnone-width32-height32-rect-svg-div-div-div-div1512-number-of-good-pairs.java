class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        int count [] = new int[101];
        for(int n : nums)
            count[n]++;
        for(int n : count)
            res+=(n*(n-1))/2;
        return res;
    }
}