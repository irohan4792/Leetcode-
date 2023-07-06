class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        for(char ch : jewels.toCharArray()){
            for(char c : stones.toCharArray()){
                if(c==ch) res++;
            }
        }
        return res;
    }
}