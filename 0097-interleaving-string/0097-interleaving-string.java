class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int a = s1.length();
        int b = s2.length();
        int c = s3.length();
        if(a+b!=c) return false;
        Boolean dp [][] = new Boolean[a+1][b+1];
        return helper(s1,s2,s3,0,0,0,dp);
    }
    boolean helper(String s1, String s2, String s3, int i, int j , int k, Boolean[][]dp){
        if(k==s3.length()) return true;
        if(dp[i][j]!=null) return dp[i][j];
        boolean flag = false;
        if(i<s1.length() && j<s2.length() && s1.charAt(i)==s3.charAt(k)&&s2.charAt(j)==s3.charAt(k)){
            flag = helper(s1,s2,s3,i+1,j,k+1,dp) || helper(s1,s2,s3,i,j+1,k+1,dp);
        } else if(i<s1.length()&&s1.charAt(i)==s3.charAt(k)){
            flag=helper(s1,s2,s3,i+1,j,k+1,dp);
        }else if(j<s2.length()&&s2.charAt(j)==s3.charAt(k)){
             flag=helper(s1,s2,s3,i,j+1,k+1,dp);
        }
        dp[i][j] = flag;
        return flag;      
    }
}