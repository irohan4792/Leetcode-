class Solution {
    public int secondHighest(String s) {
        int max = -1; int second = -1;
        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int n = s.charAt(i)-'0';
                if(n > max){
                    second=max;
                    max=n;
                }
                else if(n>second && max>n) second=n;
            
            }
        }
        return second;
    }
}