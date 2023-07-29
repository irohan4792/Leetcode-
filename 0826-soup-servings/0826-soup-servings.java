class Solution {
    Double [][]dp;
    public double soupServings(int n) {
        if(n>=4800) return 1.0;
        dp = new Double [n+1][n+1];
        return help(n,n);
    }
    private double help(int a, int b){
        if(a<=0 && b<=0) return 0.5;
        if(a<=0) return 1;
        if(b<=0) return 0;
        if(dp[a][b]!=null) return dp[a][b];
        return dp[a][b]=0.25*(help(a-100,b)+help(a-75,b-25)+help(a-50,b-50)+help(a-25,b-75));
    }
}