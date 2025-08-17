class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String res = strs[0];
        int preflen = res.length(); 
        for(int i = 1 ; i < strs.length ; i++){
            String s = strs[i];
            while(preflen > s.length() || !res.equals(s.substring(0,preflen))){
                preflen--;
                if(preflen==0) return "";
                res=res.substring(0,preflen);
            }
        }
        return res;
    }
}