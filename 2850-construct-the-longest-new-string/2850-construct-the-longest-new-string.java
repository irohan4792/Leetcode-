class Solution {
    public int longestString(int x, int y, int z) {
        int ans = Math.min(x,y);
        return (x==y) ? ((z+2*ans)*2) : ((1+z+2*ans)*2);
    }
}