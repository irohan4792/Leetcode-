class Solution {
    public boolean isNumber(String s) {
        s=s.toLowerCase().trim();
        boolean dot=false;
        boolean e = false;
        boolean before = false;
        boolean after = false;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if('0'<=c && c<='9'){
                if(!e) before = true;
                if(e) after = true;
            }
            else if(c=='-' || c=='+'){
                if(i!=0 && s.charAt(i-1)!='e') return false;
            }
            else if(c=='.'){
                if(e||dot) return false;
                dot=true;
            }
            else if(c=='e'){
                if(e) return false;
                e = true;
            }
            else{
                return false;
            }
        }
        return e ? (before && after) : before;
    }
}