class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
                StringBuilder strbuilder1 = new StringBuilder();
        for (int i = 0 ; i < word1.length ; i++){
            strbuilder1.append(word1[i]);
        }
        String newstring1 = strbuilder1.toString();
        
        
        StringBuilder strbuilder2 = new StringBuilder();
        for (int j = 0 ; j < word2.length ; j++){
            strbuilder2.append(word2[j]);
        }
        String newstring2 = strbuilder2.toString();
        
        if(newstring1.equals(newstring2)){
            return true;
        }
        else {
            return false;
        }
        
    }
}