class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = s+s;
        String se = str.substring(1,str.length()-1);
        return se.contains(s);
    }
}