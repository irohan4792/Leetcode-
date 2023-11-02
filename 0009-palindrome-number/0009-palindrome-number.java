class Solution {
    public boolean isPalindrome(int x) {
        int dup = x;
        int rev = 0;
        while(x>0){
            int last = x%10;
            rev = 10*rev+last;
            x=x/10;
        }
        if(rev==dup) return true;
        return false;
    }
}