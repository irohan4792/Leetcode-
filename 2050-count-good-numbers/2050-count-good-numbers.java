class Solution {
    public int countGoodNumbers(long n) {
    return (int)(pow(5, (n+1)/2)*pow(4,n/2)%1000000007); 
    }
    long pow(int val, long n){
    if(n==0 )
        return 1; 
    long p=pow(val,n/2);
    if(n%2!=0)
        return (p*p*val) %1000000007;
    return (p*p) %1000000007;
    }
}