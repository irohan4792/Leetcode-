class Solution {
    public int lengthOfLastWord(String s) {
        String [] res = s.split(" ");
        String rett = res[res.length-1];
        return rett.length();
    }
}