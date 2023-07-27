class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int t = 0;
        for( int i : left){
            t = Math.max(t,i);
        }
        for(int j : right){
            t=Math.max(t,n-j);
        }
        return t;
    }
}