class Solution {
    public boolean isAcronym(List<String> words, String s) {
        char alpha[] = s.toCharArray();
        if(alpha.length != words.size()) return false;
        for(int i = 0 ; i < alpha.length ; i++){
            if(alpha[i]!=words.get(i).charAt(0)) return false;
        }
        return true;
    }
}