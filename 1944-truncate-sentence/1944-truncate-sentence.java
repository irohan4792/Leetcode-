class Solution {
    public String truncateSentence(String s, int k) {
        String [] res = s.split(" ");
        // String arr[] = res.toArray();
        StringBuilder fin = new StringBuilder();
        for(int i = 0 ; i < k ; i++){
            fin.append(res[i]);
            fin.append(" ");
        }
        return fin.toString().trim();
    }
}